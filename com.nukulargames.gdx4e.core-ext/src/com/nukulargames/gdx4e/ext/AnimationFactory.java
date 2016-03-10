package com.nukulargames.gdx4e.ext;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AnimationFactory {
	public static Animation createAnimation(Texture texture, int rows, int columns, float delay) {
		TextureRegion[][] splitted = TextureRegion.split(texture, texture.getWidth() / columns, texture.getHeight() / rows);
		TextureRegion[] frames = new TextureRegion[columns * rows];
		int index = 0;
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				frames[index++] = splitted[i][j];
			}
		}
		Animation animation = new Animation(delay, frames);
		return animation;
	}
}
