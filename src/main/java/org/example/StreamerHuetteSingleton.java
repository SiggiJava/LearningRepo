package org.example;

import java.util.ArrayList;

public class StreamerHuetteSingleton extends Streamer{

    private static StreamerHuetteSingleton streamerHuette = null;
    private ArrayList<Viewer> huettesViewers = new ArrayList<>();
    private boolean isLive = false;

    private StreamerHuetteSingleton(){
        super();
    }

    public static StreamerHuetteSingleton getHuette(){
        if (streamerHuette == null) {
            streamerHuette = new StreamerHuetteSingleton();
        }
        return streamerHuette;
    }

    @Override
    public void register(Viewer viewer) {
        this.huettesViewers.add(viewer);
        System.out.println("Viewer is now registered to Huette!");
    }

    @Override
    public void unregister(Viewer viewer) {
        this.huettesViewers.remove(viewer);
    }

    @Override
    public void notify(String message) {
        for (Viewer viewer : huettesViewers) {
            this.isLive = true;
            viewer.getAlert(message + " " + getStatus());
            this.isLive = false;
        }
    }

    @Override
    public String getStatus() {
        return "Is Huette live: " + streamerHuette.isLive;
    }
}
