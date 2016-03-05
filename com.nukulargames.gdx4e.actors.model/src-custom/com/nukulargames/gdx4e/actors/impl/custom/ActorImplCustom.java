package com.nukulargames.gdx4e.actors.impl.custom;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.nukulargames.gdx4e.actors.ActorsFactory;
import com.nukulargames.gdx4e.actors.Animation;
import com.nukulargames.gdx4e.actors.State;
import com.nukulargames.gdx4e.actors.impl.ActorImpl;

public class ActorImplCustom extends ActorImpl {

	@Override
	public EList<State> getNormalizedStates() {
		if (getStates() != null && !getStates().isEmpty()) {
			return getStates();
		}
		
		State defaultState = ActorsFactory.eINSTANCE.createState();
		defaultState.setName("default");		
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
		defaultAnimation.setName("default");
		defaultAnimation.setTexture(getName().substring(getName().lastIndexOf('.') + 1) + ".png");
		EList<Animation> normalizedAnimations = new BasicEList<Animation>();
		normalizedAnimations.add(defaultAnimation);
		return normalizedAnimations;
	}
	
}
