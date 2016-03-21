package com.nukulargames.gdx4e.actors.impl.custom;

import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.impl.AnimationImpl;

public class AnimationImplCustom extends AnimationImpl {

	private static final String DEFAULT_TEXTURE_EXTENSION = ".png";
	private static final String ACTOR_NAME_SEGMENT_SEPARATOR = ".";
	private static final String ACTOR_TEXTURE_NAME_SEGMENT_SEPARATOR = "_";

	@Override
	public String getNormalizedTexture() {
		if (getTexture() != null) {
			return getTexture();
		} else {
			Actor actor = (Actor) eContainer();
			return actor.getName().substring(actor.getName().lastIndexOf(ACTOR_NAME_SEGMENT_SEPARATOR) + 1)
					+ ACTOR_TEXTURE_NAME_SEGMENT_SEPARATOR + getName() + DEFAULT_TEXTURE_EXTENSION;
		}
	}

}
