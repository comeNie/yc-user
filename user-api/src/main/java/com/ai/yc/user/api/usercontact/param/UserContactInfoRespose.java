package com.ai.yc.user.api.usercontact.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class UserContactInfoRespose extends BaseResponse{

	private static final long serialVersionUID = 1L;
	
	private List<UserContactInfo> usrContactList;

	public List<UserContactInfo> getUsrContactList() {
		return usrContactList;
	}

	public void setUsrContactList(List<UserContactInfo> usrContactList) {
		this.usrContactList = usrContactList;
	}
}
