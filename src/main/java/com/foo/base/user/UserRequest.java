package com.foo.base.user;

import com.foo.base.request.ARequest;

public class UserRequest extends ARequest {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
