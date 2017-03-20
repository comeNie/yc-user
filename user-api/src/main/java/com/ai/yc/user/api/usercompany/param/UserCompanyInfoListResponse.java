package com.ai.yc.user.api.usercompany.param;


import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class UserCompanyInfoListResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;
	
	public PageInfo<UsrCompanyInfo> companyList;

	public PageInfo<UsrCompanyInfo> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(PageInfo<UsrCompanyInfo> companyList) {
		this.companyList = companyList;
	}
	
}
