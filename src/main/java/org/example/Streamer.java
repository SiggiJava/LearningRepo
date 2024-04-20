package org.example;

import java.util.ArrayList;

public class Streamer implements StreamerInterface{

    private ArrayList<Viewer> viewerArrayList;
    private boolean isLive;

    public Streamer() {
        this.viewerArrayList = new ArrayList<>();
        this.isLive = false;
    }

    @Override
    public void register(Viewer viewer) {
        this.viewerArrayList.add(viewer);
    }

    @Override
    public void unregister(Viewer viewer) {
        this.viewerArrayList.remove(viewer);
    }

    @Override
    public void notify(String message) {
        for (Viewer v : this.viewerArrayList) {

        }
    }

    @Override
    public String getStatus() {
        return "Is live: " + this.isLive;
    }
}
