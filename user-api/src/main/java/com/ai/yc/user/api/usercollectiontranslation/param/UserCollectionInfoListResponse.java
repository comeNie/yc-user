package com.ai.yc.user.api.usercollectiontranslation.param;


import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class UserCollectionInfoListResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;
	
	public PageInfo<UserCollectionInfo> collectionList;

	public PageInfo<UserCollectionInfo> getCollectionList() {
		return collectionList;
	}

	public void setCollectionList(PageInfo<UserCollectionInfo> collectionList) {
		this.collectionList = collectionList;
	}
}
