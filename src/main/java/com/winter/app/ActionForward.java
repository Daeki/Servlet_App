package com.winter.app;

public class ActionForward {
	//true: forward, false:redirect
	private boolean flag;
	
	//forwardtl jsp의 경로,  redirect시 url 경로
	private String path;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
