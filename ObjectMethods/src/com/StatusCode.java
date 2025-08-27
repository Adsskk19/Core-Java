package com;

public enum StatusCode {
	
	SUCCESS(200) , NOTFOUND(404), BADREQUEST(400);

	private int code;
	
	private StatusCode(int code) {
		this.code=code;
	}

	public int getCode() {
		return code;
	}

	
	
}
