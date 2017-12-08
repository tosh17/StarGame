package ru.thstdio17.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ru.thstdio17.StarGame;
import ru.thstdio17.Start2dGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height=512;
		config.width=512;

		new LwjglApplication(new Start2dGame(), config);
	}
}
