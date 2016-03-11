package com.sdu.group.seven.core;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 *
 * @author Anders
 */
public class Main {
    
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "2dShooter";
        cfg.width = 700;
        cfg.height = 600;
        cfg.resizable = false;
        
        //TODO: Dont cast Game to ApplicationListener
        new LwjglApplication(new Game(), cfg);
    }
    
}
