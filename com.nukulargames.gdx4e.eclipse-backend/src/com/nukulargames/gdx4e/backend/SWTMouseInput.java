package com.nukulargames.gdx4e.backend;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseWheelListener;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

public class SWTMouseInput implements Input, MouseMoveListener, MouseListener, MouseWheelListener {

	private int x = 0;
	private int y = 0;
	private int deltaX = 0;
	private int deltaY = 0;
	
	private boolean leftButtonPressed = false;
	private boolean middleButtonPressed = false;
	private boolean rightButtonPressed = false;
	
	private InputProcessor processor;
	
	@Override
	public void cancelVibrate() {
	}

	@Override
	public float getAccelerometerX() {
		return 0;
	}

	@Override
	public float getAccelerometerY() {
		return 0;
	}

	@Override
	public float getAccelerometerZ() {
		return 0;
	}

	@Override
	public float getAzimuth() {
		return 0;
	}

	@Override
	public long getCurrentEventTime() {
		return 0;
	}

	@Override
	public int getDeltaX() {
		return deltaX;
	}

	@Override
	public int getDeltaX(int arg0) {
		return getDeltaX();
	}

	@Override
	public int getDeltaY() {
		return deltaY;
	}

	@Override
	public int getDeltaY(int arg0) {
		return getDeltaY();
	}

	@Override
	public float getGyroscopeX() {
		return 0;
	}

	@Override
	public float getGyroscopeY() {
		return 0;
	}

	@Override
	public float getGyroscopeZ() {
		return 0;
	}

	@Override
	public InputProcessor getInputProcessor() {
		return processor;
	}

	@Override
	public Orientation getNativeOrientation() {
		return null;
	}

	@Override
	public float getPitch() {
		return 0;
	}

	@Override
	public float getRoll() {
		return 0;
	}

	@Override
	public int getRotation() {
		return 0;
	}

	@Override
	public void getRotationMatrix(float[] arg0) {
	}

	@Override
	public void getTextInput(TextInputListener arg0, String arg1, String arg2, String arg3) {
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getX(int arg0) {
		return getX();
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getY(int arg0) {
		return getY();
	}

	@Override
	public boolean isButtonPressed(int button) {
		if (Buttons.LEFT == button) {
			return leftButtonPressed;
		} else if (Buttons.MIDDLE == button) {
			return middleButtonPressed;
		} else if (Buttons.RIGHT == button) {
			return rightButtonPressed;
		}
		return false;
	}

	@Override
	public boolean isCatchBackKey() {
		return false;
	}

	@Override
	public boolean isCatchMenuKey() {
		return false;
	}

	@Override
	public boolean isCursorCatched() {
		return false;
	}

	@Override
	public boolean isKeyJustPressed(int arg0) {
		return false;
	}

	@Override
	public boolean isKeyPressed(int arg0) {
		return false;
	}

	@Override
	public boolean isPeripheralAvailable(Peripheral arg0) {
		return false;
	}

	@Override
	public boolean isTouched() {
		return false;
	}

	@Override
	public boolean isTouched(int arg0) {
		return false;
	}

	@Override
	public boolean justTouched() {
		return false;
	}

	@Override
	public void setCatchBackKey(boolean arg0) {
	}

	@Override
	public void setCatchMenuKey(boolean arg0) {
	}

	@Override
	public void setCursorCatched(boolean arg0) {
	}

	@Override
	public void setCursorPosition(int arg0, int arg1) {
	}

	@Override
	public void setInputProcessor(InputProcessor processor) {
		this.processor = processor;
	}

	@Override
	public void setOnscreenKeyboardVisible(boolean arg0) {
	}

	@Override
	public void vibrate(int arg0) {
	}

	@Override
	public void vibrate(long[] arg0, int arg1) {
	}

	@Override
	public void mouseMove(MouseEvent e) {
		deltaX = x - e.x;
		deltaY = y - e.y;
		x = e.x;
		y = e.y;
		
		if (processor != null) {
			processor.touchDragged(e.x, e.y, 0);
		}
	}

	@Override
	public void mouseDoubleClick(MouseEvent e) {
	}

	@Override
	public void mouseDown(MouseEvent e) {
		if (e.button == 1) {
			leftButtonPressed = true;
		} else if (e.button == 2) {
			middleButtonPressed = true;
		} else if (e.button == 3) {
			rightButtonPressed = true;
		}
		
		if (processor != null) {
			processor.touchDown(e.x, e.y, 0, swt2GdxButton(e.button));
		}
	}

	@Override
	public void mouseUp(MouseEvent e) {
		if (e.button == 1) {
			leftButtonPressed = false;
		} else if (e.button == 2) {
			middleButtonPressed = false;
		} else if (e.button == 3) {
			rightButtonPressed = false;
		}
		
		if (processor != null) {
			processor.touchUp(e.x, e.y, 0, swt2GdxButton(e.button));
		}
	}

	@Override
	public void mouseScrolled(MouseEvent e) {
		if (processor != null) {
			processor.scrolled(e.count);
		}
	}

	private int swt2GdxButton(int button) {
		if (button == 1) {
			return Buttons.LEFT;
		} else if (button == 2) {
			return Buttons.MIDDLE;
		} else if (button == 3) {
			return Buttons.RIGHT;
		}
		return -1;
	}
}
