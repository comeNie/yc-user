package com.ai.yc.user.service.atom.interfaces;

import com.ai.yc.user.dao.mapper.bo.UserLevelChanage;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValue;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValueCriteria;

import java.util.List;

public interface IYCUserLevelChangeAtomSV {
	public List<UserLevelChanage> queryLevelInfo(String userId);
}
