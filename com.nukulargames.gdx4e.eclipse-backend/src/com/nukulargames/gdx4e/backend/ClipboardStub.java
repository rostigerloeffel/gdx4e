package com.nukulargames.gdx4e.backend;

import com.badlogic.gdx.utils.Clipboard;

public class ClipboardStub implements Clipboard {
	private String content;
	
	@Override
	public String getContents () {		
		return content;
	}

	@Override
	public void setContents (String content) {
		this.content = content;
	}
}
