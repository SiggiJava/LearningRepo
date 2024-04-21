package org.example.singletonandobserverpattern;

public class Main {
    public static void main(String[] args) {

        Streamer st = StreamerHuetteSingleton.getHuette();
        Viewer v = ViewerMichaelSingleton.getMichael();

        ((ViewerMichaelSingleton) v).subscribeToStreamer(st);
        st.notify("Going live in 3... 2... 5...");
        ((ViewerMichaelSingleton) v).refresh();

    }
}