package com.ai.yc.user.api.userservice.param;

public class CompleteUserInfoRequest {
	/**
	 * 手机注册时userId需要有值
	 */
	private String userId;
	/**
     * 手机号
     */
    private String mobilePhone;
    /**
     * 登录名
     */
    private String loginName;
    
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
    
    
}
