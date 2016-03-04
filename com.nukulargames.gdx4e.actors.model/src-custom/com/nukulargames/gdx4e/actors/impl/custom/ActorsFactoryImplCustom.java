package com.nukulargames.gdx4e.actors.impl.custom;

import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.impl.ActorsFactoryImpl;

public class ActorsFactoryImplCustom extends ActorsFactoryImpl {

	@Override
	public Actor createActor() {
		return new ActorImplCustom();
	}
	
}
