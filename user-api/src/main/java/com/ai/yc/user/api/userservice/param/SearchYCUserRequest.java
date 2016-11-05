package com.ai.yc.user.api.userservice.param;

import java.io.Serializable;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月2日 上午11:19:33 
 * @version 
 * @since  
 */
public class SearchYCUserRequest  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4314651793756447401L;
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
