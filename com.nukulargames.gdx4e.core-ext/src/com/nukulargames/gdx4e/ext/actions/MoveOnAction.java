package com.nukulargames.gdx4e.ext.actions;

import com.badlogic.gdx.math.Path;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.TemporalAction;

public class MoveOnAction extends TemporalAction {

	public static Action moveOn(Path<Vector2> path, float speed) {
		return new MoveOnAction(path, speed);
	}

	public static Action moveOn(Path<Vector2> path, float speed, boolean fixDirection) {
		return new MoveOnAction(path, speed, fixDirection);
	}

	public static Action moveOn(Path<Vector2> path, float speed, float rotationOffset, boolean fixDirection) {
		return new MoveOnAction(path, speed, rotationOffset, fixDirection);
	}

	private Path<Vector2> path;
	private Vector2 lastPosition, lastDirection;
	private boolean fixDirection = true;
	private float rotationOffset = 0.0f;

	MoveOnAction(Path<Vector2> path, float speed) {
		super(path.approxLength(30) / speed);
		this.path = path;
		reset();
	}

	MoveOnAction(Path<Vector2> path, float speed, boolean fixDirection) {
		this(path, speed);
		this.fixDirection = fixDirection;
	}

	MoveOnAction(Path<Vector2> path, float speed, float rotationOffset, boolean fixDirection) {
		this(path, speed, fixDirection);
		this.rotationOffset = rotationOffset;
	}

	@Override
	protected void begin() {
		Vector2 direction = new Vector2(0.0f, 0.01f);
		float angle = direction.angle(lastDirection);

		if (fixDirection) {
			getActor().setRotation(angle + rotationOffset);
		}

		super.begin();
	}

	@Override
	public void restart() {
		this.lastPosition = path.valueAt(new Vector2(), 0.0f);
		this.lastDirection = path.valueAt(new Vector2(), 0.1f).sub(lastPosition);
		super.restart();
	}

	@Override
	public void reset() {
		this.lastPosition = path.valueAt(new Vector2(), 0.0f);
		this.lastDirection = path.valueAt(new Vector2(), 0.1f).sub(lastPosition);
		super.reset();
	}

	@Override
	protected void update(float percent) {
		Vector2 position = path.valueAt(new Vector2(), percent);

		Vector2 direction = position.cpy().sub(lastPosition);
		float angle = direction.angle(lastDirection);

		getActor().setX(getActor().getX() + direction.x);
		getActor().setY(getActor().getY() + direction.y);

		if (fixDirection) {
			getActor().setRotation(getActor().getRotation() - angle);
		}

		lastPosition = position;
		lastDirection = direction;
	}

}