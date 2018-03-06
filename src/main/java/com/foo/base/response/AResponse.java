package com.foo.base.response;

public class AResponse<T> {

	private T context;
	private int status = 0;
	private String msg = "0";

	public T getContext() {
		return context;
	}

	public void setContext(T context) {
		this.context = context;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
