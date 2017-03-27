package com.ai.yc.user.api.usercompanyrelation.param;


import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class CompanyRelationResponse extends BaseResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PageInfo<CompanyRelationInfo> list;
	public PageInfo<CompanyRelationInfo> getList() {
		return list;
	}
	public void setList(PageInfo<CompanyRelationInfo> list) {
		this.list = list;
	}
	

}
