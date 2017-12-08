package ru.thstdio17;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

public class StarGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img, img1;
    int x = 1, y = 1, dX = 1, dY = 3;
    int h, w;
    private Random r;


    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("starfon.jpg");
        img1 = new Texture("badlogic.jpg");
        h = Gdx.graphics.getHeight();
        w = Gdx.graphics.getWidth();
        h -= img1.getHeight();
        w -= img1.getWidth();
        r=new Random();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        if (x > w || x <= 0) dX = (x>0?-1:1) * r.nextInt(10);
        if (y > h || y <= 0) dY = (y>0?-1:1) * r.nextInt(10);
        x += dX;
        y += dY;
        batch.begin();
        batch.draw(img, 0, 0);
        batch.draw(img1, x, y);

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
