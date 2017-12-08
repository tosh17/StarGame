package ru.thstdio17;

import com.badlogic.gdx.Game;

/**
 * Created by shcherbakov on 09.12.2017.
 */

public class Start2dGame extends Game {
    /**
     * Called when the {@link Application} is first created.
     */
    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }
}
