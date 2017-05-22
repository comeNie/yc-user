package com.ai.yc.user.service.business.interfaces;

import com.ai.yc.user.dao.mapper.bo.UserLevelChanage;

import java.util.List;

public interface IYCUserLevelChangeBusiSV {
	public List<UserLevelChanage> queryLevelInfo(String userId);
}
