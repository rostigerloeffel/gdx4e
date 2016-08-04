package com.nukulargames.gdx4e.actors.impl.custom;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.ActorsFactory;
import com.nukulargames.gdx4e.actors.Animation;
import com.nukulargames.gdx4e.actors.State;
import com.nukulargames.gdx4e.actors.impl.ActorImpl;

public class ActorImplCustom extends ActorImpl {

	private static final String DEFAULT_NAME = "default";
	private static final String DEFAULT_TEXTURE_EXTENSION = ".png";
	private static final String ACTOR_NAME_SEGMENT_SEPARATOR = ".";

	@Override
	public EList<State> getNormalizedStates() {
		if (getStates() != null && !getStates().isEmpty()) {
			return getStates();
		}

		State defaultState = ActorsFactory.eINSTANCE.createState();
		defaultState.setName(DEFAULT_NAME);
		defaultState.setAnimation(getNormalizedAnimations().get(0));
		EList<State> normalizedStates = new BasicEList<State>();
		normalizedStates.add(defaultState);
		return normalizedStates;
	}

	@Override
	public EList<Animation> getNormalizedAnimations() {
		if (getAnimations() != null && !getAnimations().isEmpty()) {
			return getAnimations();
		}

		Animation defaultAnimation = ActorsFactory.eINSTANCE.createAnimation();
		defaultAnimation.setName(DEFAULT_NAME);
		if (getName() != null) {
			defaultAnimation.setTexture(getName().substring(getName().lastIndexOf(ACTOR_NAME_SEGMENT_SEPARATOR) + 1)
					+ DEFAULT_TEXTURE_EXTENSION);
		}
		EList<Animation> normalizedAnimations = new BasicEList<Animation>();
		normalizedAnimations.add(defaultAnimation);
		return normalizedAnimations;
	}

}
