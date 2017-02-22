package com.ai.yc.user.api.usercollectiontranslation.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class UserCollectionInfoListResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;
	
	public PageInfo<UserCollectionInfo> getCollectionListByPage;
	

	public PageInfo<UserCollectionInfo> getGetCollectionListByPage() {
		return getCollectionListByPage;
	}

	public void setGetCollectionListByPage(
			PageInfo<UserCollectionInfo> getCollectionListByPage) {
		this.getCollectionListByPage = getCollectionListByPage;
	}

}
