package com.ai.yc.user.api.usercompany.param;

import java.sql.Timestamp;

public class UserCompanyRelationPageInfo {
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 企业角色
	 */
	private int isManagment;
	
	/**
	 * 加入时间
	 */
	private Timestamp joinTime;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getIsManagment() {
		return isManagment;
	}

	public void setIsManagment(int isManagment) {
		this.isManagment = isManagment;
	}

	public Timestamp getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Timestamp joinTime) {
		this.joinTime = joinTime;
	}
	
	
	
}
