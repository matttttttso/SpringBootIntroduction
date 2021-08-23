package com.example.demo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Message implements Serializable {
	private String text;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
