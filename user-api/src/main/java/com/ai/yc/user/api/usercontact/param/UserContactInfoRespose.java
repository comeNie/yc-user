package com.ai.yc.user.api.usercontact.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class UserContactInfoRespose extends BaseResponse{

	private static final long serialVersionUID = 1L;
	
	private List<UserContactInfo> usrContactList;

	private List<String> list;
	
	private String userId;
	
	public List<UserContactInfo> getUsrContactList() {
		return usrContactList;
	}

	public void setUsrContactList(List<UserContactInfo> usrContactList) {
		this.usrContactList = usrContactList;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
