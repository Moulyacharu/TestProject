package com.customexceptio;

public class DefineExceptions extends Exception {
	private String message;

	public DefineExceptions() {
		message = "written error message";
	}

	public String getMessage() {
		return message;
	}
}
