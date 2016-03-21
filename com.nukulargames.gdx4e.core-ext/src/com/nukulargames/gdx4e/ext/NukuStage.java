package com.nukulargames.gdx4e.ext;

import java.util.Collection;

import com.badlogic.gdx.scenes.scene2d.Stage;

public abstract class NukuStage extends Stage {

	public abstract <T> Collection<T> findFirst(Class<T> actorClazz);
	
	public abstract <T> Collection<T> findAll(Class<T> actorClazz);
	
}
