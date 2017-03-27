package com.ai.yc.user.api.usercompanyrelation.param;

import java.sql.Timestamp;


public class CompanyRelationInfo{
	
	private String userId;
	
	private String nickname;
	
	private String username;
	
	private int isManagment;
	
	private int griwthValue;
	
	private Timestamp joinTime;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getIsManagment() {
		return isManagment;
	}

	public void setIsManagment(int isManagment) {
		this.isManagment = isManagment;
	}

	public int getGriwthValue() {
		return griwthValue;
	}

	public void setGriwthValue(int griwthValue) {
		this.griwthValue = griwthValue;
	}

	public Timestamp getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Timestamp joinTime) {
		this.joinTime = joinTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
