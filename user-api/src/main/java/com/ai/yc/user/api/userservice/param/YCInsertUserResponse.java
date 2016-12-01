package com.ai.yc.user.api.userservice.param;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月2日 上午11:32:23 
 * @version 
 * @since  
 */
public class YCInsertUserResponse extends BaseResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1664750013408382459L;

	/**
	 * 用户uid／userid
	 */
	private String userId;
	/**
	 * 验证码
	 */
	private String operationcode;
	/**
	 * 用户
	 */
	private String username;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOperationcode() {
		return operationcode;
	}
	public void setOperationcode(String operationcode) {
		this.operationcode = operationcode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
