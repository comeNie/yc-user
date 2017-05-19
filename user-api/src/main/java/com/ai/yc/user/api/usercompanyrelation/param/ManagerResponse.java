package com.ai.yc.user.api.usercompanyrelation.param;


import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

import java.sql.Timestamp;

public class ManagerResponse extends BaseResponse {
	private String companyId;

	private String userId;

	private Integer isManagement;

	private Timestamp joinTime;

	private String status;

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId == null ? null : companyId.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public Integer getIsManagement() {
		return isManagement;
	}

	public void setIsManagement(Integer isManagement) {
		this.isManagement = isManagement;
	}

	public Timestamp getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Timestamp joinTime) {
		this.joinTime = joinTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	

}
