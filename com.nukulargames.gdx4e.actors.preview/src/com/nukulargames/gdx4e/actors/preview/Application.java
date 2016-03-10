package com.nukulargames.gdx4e.actors.preview;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.Animation;

public class Application extends ApplicationAdapter {

	private Stage stage;
	private PreviewActor previewActor;
	
	@Override
	public void create() {
		stage = new Stage(new FitViewport(100.0f, 100.0f));	
		Gdx.input.setInputProcessor(new CameraMouseProcessor(stage));
		
		previewActor = new PreviewActor();
		stage.addActor(previewActor);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0.7f, 0.7f, 0.7f, 1.0f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.act();
		stage.draw();
	}

	public void setAnimation(Animation animation, String texturePath) {
		previewActor.setAnimation(animation, texturePath);
	}

	public void setActor(Actor actor) {

	}
}
