package com.nukulargames.gdx4e.actors.impl.custom;

import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.impl.AnimationImpl;

public class AnimationImplCustom extends AnimationImpl {

	private static String DEFAULT_TEXTURE_EXTENSION = ".png";
	
	@Override
	public String getNormalizedTexture() {
		if (getTexture() != null) {
			return getTexture();
		} else {
			Actor actor = (Actor) eContainer();
			return actor.getName().substring(actor.getName().lastIndexOf('.') + 1) + "_" + getName() + DEFAULT_TEXTURE_EXTENSION;
		}
	}

}
