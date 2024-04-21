package org.example.patternexamples;

import java.util.ArrayList;

public class ViewerMichaelSingleton extends Viewer{

    private static ViewerMichaelSingleton viewerMichael;
    private ArrayList<Streamer> streamers;

    private ViewerMichaelSingleton() {
        super();
        streamers = new ArrayList<>();
    }

    public static ViewerMichaelSingleton getMichael() {
        if(viewerMichael == null) {
            viewerMichael = new ViewerMichaelSingleton();
        }
        return viewerMichael;
    }

    @Override
    public void refresh() {
        for(Streamer streamer : streamers) {
            System.out.println(streamer.getStatus());
        }
    }

    public void subscribeToStreamer(Streamer streamer) {
        streamer.register(this);
        streamers.add(streamer);
    }

    public void unsubscribeFromStreamer(Streamer streamer) {
        streamer.unregister(this);
        streamers.remove(streamer);
    }

    @Override
    public void getAlert(String message) {
        System.out.println("Message for Michael: " + message);
    }
}
