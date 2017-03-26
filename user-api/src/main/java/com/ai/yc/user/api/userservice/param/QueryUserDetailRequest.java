package com.ai.yc.user.api.userservice.param;

import java.io.Serializable;

public class QueryUserDetailRequest implements Serializable {

	private static final long serialVersionUID = 3084602341131713424L;
	
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
