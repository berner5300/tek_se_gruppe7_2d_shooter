package com.sdu.group.seven.common.data;

/**
 *
 * @author Anders
 */
public class GameData {
    private float delta;
    private int displayWidth;
    private int displayHeight;
    
    private final GameKeys keys = new GameKeys();
    
    public GameKeys getKeys() {
        return keys;
    }
    
    public float getDelta() {
        return delta;
    }

    public void setDelta(float delta) {
        this.delta = delta;
    }

    public int getDisplayWidth() {
        return displayWidth;
    }

    public void setDisplayWidth(int displayWidth) {
        this.displayWidth = displayWidth;
    }

    public int getDisplayHeight() {
        return displayHeight;
    }

    public void setDisplayHeight(int displayHeight) {
        this.displayHeight = displayHeight;
    }
    
    
}
