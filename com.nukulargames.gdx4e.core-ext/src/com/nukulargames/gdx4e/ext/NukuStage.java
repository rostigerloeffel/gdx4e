package com.nukulargames.gdx4e.ext;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.Viewport;

public abstract class NukuStage extends Stage {

	private Actor lookAt;

	public NukuStage(Viewport viewport) {
		super(viewport);
	}

	@Override
	public void act(float delta) {
		if (lookAt != null) {
			Vector2 stageCoordinates = lookAt.localToStageCoordinates(Vector2.Zero.cpy());
			getCamera().position.x = stageCoordinates.x + lookAt.getOriginX() / 2.0f;
			getCamera().position.y = stageCoordinates.y + lookAt.getOriginY() / 2.0f;
			getCamera().update();
		}

		super.act(delta);
	}

	public Actor getLookAt() {
		return lookAt;
	}

	public void lookAt(Actor lookAt) {
		this.lookAt = lookAt;
	}

	@SuppressWarnings("unchecked")
	public <T> T findFirst(Class<T> actorClazz) {
		return Arrays.asList(getActors()).stream().filter(a -> {
			return actorClazz.isAssignableFrom(a.getClass());
		}).map(a -> {
			return (T) a;
		}).findFirst().orElse(null);
	}

	@SuppressWarnings("unchecked")
	public <T> Collection<T> findAll(Class<T> actorClazz) {
		return Arrays.asList(getActors()).stream().filter(a -> {
			return actorClazz.isAssignableFrom(a.getClass());
		}).map(a -> {
			return (T) a;
		}).collect(Collectors.toList());
	}

}
