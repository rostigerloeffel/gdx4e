package com.nukulargames.gdx4e.backend;

import com.badlogic.gdx.Audio;
import com.badlogic.gdx.audio.AudioDevice;
import com.badlogic.gdx.audio.AudioRecorder;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;

public class AudioStub implements Audio {
	
	@Override
	public AudioDevice newAudioDevice(int samplingRate, boolean isMono) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AudioRecorder newAudioRecorder(int samplingRate, boolean isMono) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sound newSound(FileHandle fileHandle) {
		// TODO Auto-generated method stub
		return new Sound() {

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public long loop() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public long loop(float arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public long loop(float arg0, float arg1, float arg2) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void pause() {
				// TODO Auto-generated method stub

			}

			@Override
			public void pause(long arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public long play() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public long play(float arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public long play(float arg0, float arg1, float arg2) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void resume() {
				// TODO Auto-generated method stub

			}

			@Override
			public void resume(long arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setLooping(long arg0, boolean arg1) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setPan(long arg0, float arg1, float arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setPitch(long arg0, float arg1) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setVolume(long arg0, float arg1) {
				// TODO Auto-generated method stub

			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub

			}

			@Override
			public void stop(long arg0) {
				// TODO Auto-generated method stub

			}

		};
	}

	@Override
	public Music newMusic(FileHandle file) {
		return new Music() {

			@Override
			public void play() {
				// TODO Auto-generated method stub

			}

			@Override
			public void pause() {
				// TODO Auto-generated method stub

			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isPlaying() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void setLooping(boolean isLooping) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isLooping() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void setVolume(float volume) {
				// TODO Auto-generated method stub

			}

			@Override
			public float getVolume() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void setPan(float pan, float volume) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setPosition(float position) {
				// TODO Auto-generated method stub

			}

			@Override
			public float getPosition() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public void setOnCompletionListener(OnCompletionListener listener) {
				// TODO Auto-generated method stub

			}

		};
	}

};
