package com.gloucode.platform.engine;

public interface IGame {

    void init();
    void shutdown();
    void render();
    void tick();

    String getName();
    String getVersion();
}