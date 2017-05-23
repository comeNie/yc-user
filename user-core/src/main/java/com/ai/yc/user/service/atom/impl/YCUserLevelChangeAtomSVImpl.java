package com.ai.yc.user.service.atom.impl;

import com.ai.yc.user.dao.mapper.attach.UsrGriwthValueAttachMapper;
import com.ai.yc.user.dao.mapper.bo.UserLevelChanage;
import com.ai.yc.user.dao.mapper.bo.UserLevelChanageCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValue;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValueCriteria;
import com.ai.yc.user.dao.mapper.interfaces.UserLevelChanageMapper;
import com.ai.yc.user.dao.mapper.interfaces.UsrGriwthValueMapper;
import com.ai.yc.user.service.atom.interfaces.IYCUserGriwthValueAtomSV;
import com.ai.yc.user.service.atom.interfaces.IYCUserLevelChangeAtomSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class YCUserLevelChangeAtomSVImpl implements IYCUserLevelChangeAtomSV{


	@Autowired
	private transient UserLevelChanageMapper userLevelChanageMapper;
	@Override
	public List<UserLevelChanage> queryLevelInfo(String userId) {

		UserLevelChanageCriteria example = new UserLevelChanageCriteria();
		UserLevelChanageCriteria.Criteria criteria = example.createCriteria();
		example.setOrderByClause("update_time desc");
		example.createCriteria().andUserIdEqualTo(userId);
		List<UserLevelChanage> levelChanages = userLevelChanageMapper.selectByExample(example);
		return levelChanages;
	}
}
