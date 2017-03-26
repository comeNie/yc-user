package com.ai.yc.user.api.userservice.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class QueryUserResponse extends BaseResponse {
	
	private static final long serialVersionUID = 9018621270910363962L;
	
	private PageInfo<YCUsrUserVO> pageInfo;

	public PageInfo<YCUsrUserVO> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<YCUsrUserVO> pageInfo) {
		this.pageInfo = pageInfo;
	}
}
