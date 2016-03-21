package com.nukulargames.gdx4e.actors.impl.custom;

import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl;

public class ActorReferenceImplCustom extends ActorReferenceImpl {

	@Override
	public Actor getNormalizedReference() {
		if (getHolds() != null) {
			return getHolds();
		} else {
			return getUses();
		}
	}
	
	@Override
	public String getNormalizedName() {
		return getNormalizedReference().getName();
	}
	
}
