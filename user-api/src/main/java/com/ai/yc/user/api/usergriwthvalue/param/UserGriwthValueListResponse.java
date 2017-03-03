package com.ai.yc.user.api.usergriwthvalue.param;


import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class UserGriwthValueListResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;
	
	public PageInfo<UsrGriwthValueInfo> getUsrGriwthValueListByPage;
	

	public PageInfo<UsrGriwthValueInfo> getGetCollectionListByPage() {
		return getUsrGriwthValueListByPage;
	}

	public void setGetCollectionListByPage(
			PageInfo<UsrGriwthValueInfo> getCollectionListByPage) {
		this.getUsrGriwthValueListByPage = getCollectionListByPage;
	}

}
