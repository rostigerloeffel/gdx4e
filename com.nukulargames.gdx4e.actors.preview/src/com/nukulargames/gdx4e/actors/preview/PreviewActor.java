package com.nukulargames.gdx4e.actors.preview;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.nukulargames.gdx4e.actors.Animation;
import com.nukulargames.gdx4e.ext.AnimationFactory;

public class PreviewActor extends Actor {

	private com.badlogic.gdx.graphics.g2d.Animation gdxAnimation;
	private float stateTime;

	public PreviewActor() {	
	}
	
	@Override
	public void act(float delta) {
		stateTime += delta;
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		if (gdxAnimation != null) {
			TextureRegion frame = gdxAnimation.getKeyFrame(stateTime, true);
			batch.draw(frame, 0.0f, 0.0f);
		}
	}

	public void setAnimation(Animation animation, String texturePath) {
		Texture texture = new Texture(Gdx.files.absolute(texturePath));
		gdxAnimation = AnimationFactory.createAnimation(texture, animation.getRows(), animation.getColumns(),
				animation.getDelay());
	}
}
