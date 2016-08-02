package com.nukulargames.gdx4e.ext;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Group;

public abstract class NukuActor extends Group {

	protected NukuActor init() {
		initPosition();
		initSize();
		initOrigin();
		initScale();
		initColor();
		return this;
	}
	
	protected NukuActor initPosition() {
		setX(0.0f);
		setY(0.0f);
		return this;
	}
	
	protected NukuActor initSize() {
		setWidth(1.0f);
		setHeight(1.0f);
		return this;
	}
	
	protected NukuActor initOrigin() {
		setOriginX(getWidth() / 2.0f);
		setOriginY(getHeight() / 2.0f);
		return this;
	}
	
	protected NukuActor initScale() {
		setScaleX(1.0f);
		setScaleY(1.0f);
		return this;
	}
	
	protected NukuActor initColor() {
		setColor(1.0f, 1.0f, 1.0f, 1.0f);
		return this;
	}

	protected NukuActor initRotation() {
		setRotation(0.0f);
		return this;
	}
	
	protected Animation createAnimation(Texture texture, int rows, int columns, float delay) {
		return AnimationFactory.createAnimation(texture, rows, columns, delay);
	}
}
