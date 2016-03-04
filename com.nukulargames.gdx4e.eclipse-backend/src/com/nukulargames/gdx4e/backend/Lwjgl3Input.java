/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.nukulargames.gdx4e.backend;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.utils.Disposable;

public class Lwjgl3Input implements Input, Disposable {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getAccelerometerX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getAccelerometerY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getAccelerometerZ() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getX(int pointer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDeltaX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDeltaX(int pointer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY(int pointer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDeltaY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDeltaY(int pointer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isTouched() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean justTouched() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTouched(int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isButtonPressed(int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isKeyPressed(int key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isKeyJustPressed(int key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getTextInput(TextInputListener listener, String title, String text, String hint) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOnscreenKeyboardVisible(boolean visible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vibrate(int milliseconds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vibrate(long[] pattern, int repeat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelVibrate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getAzimuth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getPitch() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getRoll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getRotationMatrix(float[] matrix) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getCurrentEventTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCatchBackKey(boolean catchBack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isCatchBackKey() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCatchMenuKey(boolean catchMenu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isCatchMenuKey() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setInputProcessor(InputProcessor processor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InputProcessor getInputProcessor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPeripheralAvailable(Peripheral peripheral) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRotation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Orientation getNativeOrientation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCursorCatched(boolean catched) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isCursorCatched() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCursorPosition(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getGyroscopeX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getGyroscopeY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getGyroscopeZ() {
		// TODO Auto-generated method stub
		return 0;
	}

}
