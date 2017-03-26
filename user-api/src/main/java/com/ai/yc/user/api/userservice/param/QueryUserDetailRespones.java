package com.ai.yc.user.api.userservice.param;

import java.io.Serializable;
import java.util.List;

import com.ai.opt.base.vo.BaseResponse;


public class QueryUserDetailRespones extends BaseResponse{

	private static final long serialVersionUID = 1884875141514641039L;
	/**
	 * 用户信息
	 */
	private YCUsrUserVO usrUser;
	/**
	 * 用户联系人信息
	 */
	private List<UsrContactMessage> usrContact;
	/**
	 * 用户成长值记录
	 */
	private List<UsrGriwthValueInfo> usrGriwthValueList;


	public YCUsrUserVO getUsrUser() {
		return usrUser;
	}

	public void setUsrUser(YCUsrUserVO usrUser) {
		this.usrUser = usrUser;
	}

	public List<UsrGriwthValueInfo> getUsrGriwthValueList() {
		return usrGriwthValueList;
	}

	public void setUsrGriwthValueList(List<UsrGriwthValueInfo> usrGriwthValueList) {
		this.usrGriwthValueList = usrGriwthValueList;
	}

	public List<UsrContactMessage> getUsrContact() {
		return usrContact;
	}

	public void setUsrContact(List<UsrContactMessage> usrContact) {
		this.usrContact = usrContact;
	}



}
