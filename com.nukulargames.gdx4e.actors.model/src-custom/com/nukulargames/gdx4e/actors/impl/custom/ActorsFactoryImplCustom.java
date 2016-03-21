package com.nukulargames.gdx4e.actors.impl.custom;

import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.ActorReference;
import com.nukulargames.gdx4e.actors.Animation;
import com.nukulargames.gdx4e.actors.impl.ActorsFactoryImpl;

public class ActorsFactoryImplCustom extends ActorsFactoryImpl {

	@Override
	public Actor createActor() {
		return new ActorImplCustom();
	}
	
	@Override
	public ActorReference createActorReference() {
		return new ActorReferenceImplCustom();
	}
	
	@Override
	public Animation createAnimation() {
		return new AnimationImplCustom();
	}
	
}
