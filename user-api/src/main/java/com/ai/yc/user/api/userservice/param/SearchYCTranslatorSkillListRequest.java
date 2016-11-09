package com.ai.yc.user.api.userservice.param;

import com.ai.opt.base.vo.BaseInfo;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月8日 上午11:33:09 
 * @version 
 * @since  
 */
public class SearchYCTranslatorSkillListRequest extends BaseInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8529021939899100513L;

	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
