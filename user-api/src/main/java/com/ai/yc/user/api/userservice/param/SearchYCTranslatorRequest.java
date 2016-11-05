package com.ai.yc.user.api.userservice.param;

import java.io.Serializable;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月3日 下午7:05:20 
 * @version 
 * @since  
 */
public class SearchYCTranslatorRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1445662539360692130L;
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
