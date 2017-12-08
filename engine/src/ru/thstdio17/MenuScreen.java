package ru.thstdio17;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by shcherbakov on 09.12.2017.
 */

public class MenuScreen extends Base2DScreen {
    SpriteBatch batch;
    Texture bg,img;
    boolean isImgVisible=false;
    Game game;
    private float imgX,imgY;
    private int windowH,windowW;

    public MenuScreen(Game game) {
        batch = new SpriteBatch();
        bg= new Texture("starfon.jpg");
        img = new Texture("badlogic.jpg");
        this.game = game;
    }

    /**
     * Called when this screen becomes the current screen for a {@link Game}.
     */
    @Override
    public void show() {
        super.show();

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(bg, 0, 0);
        if(isImgVisible) batch.draw(img, imgX-img.getWidth()/2, imgY-img.getHeight()/2);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("width="+width+" height="+height);
        windowH=height;
        windowW=width;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        isImgVisible=true;
        imgY=windowH-screenY;
        imgX=screenX;
        return super.touchDown(screenX, screenY, pointer, button);


    }
}
