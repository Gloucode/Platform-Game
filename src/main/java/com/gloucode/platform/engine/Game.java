package com.gloucode.platform.engine;

public abstract class Game implements IGame {

    private String name;
    private String version;

    public Game(String name, String version) {
        System.out.println("Launching " + name + " v" + version);

        this.name = name;
        this.version = version;

        Runtime.getRuntime().addShutdownHook(new Thread(this::shutdown));
    }

    @Override
    public final String getName() {
        return this.name;
    }

    @Override
    public final String getVersion() {
        return this.version;
    }
}