package org.example.singletonandobserverpattern;

public interface StreamerInterface {

    void register(Viewer viewer);

    void unregister(Viewer viewer);

    void notify(String message);

    String getStatus();
}
