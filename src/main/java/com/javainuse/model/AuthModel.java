package com.javainuse.model;

import java.io.Serializable;

public class AuthModel implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String authToken;

	public AuthModel(String authToken) {
		this.authToken = authToken;
	}

	public String getToken() {
		return this.authToken;
	}

}