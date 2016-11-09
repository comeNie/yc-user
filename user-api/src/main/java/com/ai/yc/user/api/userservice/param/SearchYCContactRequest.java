package com.ai.yc.user.api.userservice.param;

import com.ai.opt.base.vo.BaseInfo;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月3日 下午7:56:18 
 * @version 
 * @since  
 */
public class SearchYCContactRequest extends BaseInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = -928580677577720047L;
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
