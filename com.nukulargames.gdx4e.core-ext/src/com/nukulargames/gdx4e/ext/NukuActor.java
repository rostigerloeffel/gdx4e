package com.nukulargames.gdx4e.ext;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public abstract class NukuActor extends Actor {
	
	public NukuActor() {
		init();
	}
	
	protected void init() {
		initPosition();
		initSize();
		initOrigin();
		initScale();
	}
	
	abstract protected void initPosition();
	
	abstract protected void initSize();
	
	protected void initOrigin() {
		setOriginX(getWidth() / 2.0f);
		setOriginY(getHeight() / 2.0f);
	}
	
	protected void initScale() {
		setScaleX(1.0f);
		setScaleY(1.0f);
	}

	abstract protected void initRotation();
	
	protected Animation createAnimation(Texture texture, int rows, int columns, float delay) {
		return null;
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		super.draw(batch, parentAlpha);
	}
}
