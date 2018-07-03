package com.gloucode.platform.game;

import com.gloucode.platform.core.Version;
import com.gloucode.platform.engine.Game;

public class Platformer extends Game {

    public Platformer() {
        super("Platformer", Version.VERSION);
    }

    @Override
    public void init() {

    }

    @Override
    public void shutdown() {
        System.out.println("Goodbye!");
    }

    @Override
    public void render() {

    }

    @Override
    public void tick() {

    }
}