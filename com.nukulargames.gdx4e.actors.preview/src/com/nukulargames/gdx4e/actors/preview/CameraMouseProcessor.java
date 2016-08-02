package com.nukulargames.gdx4e.actors.preview;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class CameraMouseProcessor extends InputAdapter {
	private Stage stage;
	private Vector2 touchDownPosition;
	
	CameraMouseProcessor(Stage stage) {
		this.stage = stage;
	}
	
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		if (Gdx.input.isButtonPressed(Buttons.RIGHT)) {
			Vector3 worldPosition = stage.getCamera().unproject(new Vector3(screenX, screenY, 0.0f));
			touchDownPosition = new Vector2(worldPosition.x, worldPosition.y);
			return true;
		} else {
			return false;
		}
	}
	
    public boolean scrolled(int amount) {
		if (stage.getCamera() instanceof OrthographicCamera) {
			OrthographicCamera camera = (OrthographicCamera) stage.getCamera();			
            camera.zoom = camera.zoom * (1 + (amount > 0 ? -0.1f : 0.1f));
            camera.zoom = MathUtils.clamp(camera.zoom, 0.0f, 12.0f);
            return true;
		} else {
			return false;
		}
    }
	
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		if (Gdx.input.isButtonPressed(Buttons.RIGHT)) {
			Vector3 worldScroll = stage.getCamera().unproject(new Vector3((float) screenX, (float) screenY, 0.0f));
			stage.getCamera().translate(-worldScroll.x + touchDownPosition.x, -worldScroll.y + touchDownPosition.y, 0.0f);

			System.out.println("world = " + -worldScroll.x + "; " + -worldScroll.y);
			
			Vector3 position = stage.getCamera().position;
			position.set(MathUtils.clamp(position.x, -70.0f, 70.0f), MathUtils.clamp(position.y, -70.0f, 70.0f), 0.0f);
			return true;
		} else {
			return false;
		}
	}

}