package com.ai.yc.user.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.user.dao.mapper.bo.UsrGriwthValue;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValueCriteria;
import com.ai.yc.user.dao.mapper.interfaces.UsrGriwthValueMapper;
import com.ai.yc.user.service.atom.interfaces.IYCUserGriwthValueAtomSV;
@Component
public class YCUserGriwthValueAtomSVImpl implements IYCUserGriwthValueAtomSV{

	@Autowired
	private transient UsrGriwthValueMapper griwthValueMapper;
	
	@Override
	public int insertGriwthValueInfo(UsrGriwthValue griwthValueInfo) {
		return griwthValueMapper.insertSelective(griwthValueInfo);
	}

	@Override
	public int updateGriwthValueInfo(UsrGriwthValue griwthValueInfo) {
		return griwthValueMapper.updateByPrimaryKey(griwthValueInfo);
	}

	@Override
	public List<UsrGriwthValue> queryGriwthValueInfo(
			UsrGriwthValueCriteria example) {
		return griwthValueMapper.selectByExample(example);
	}

	@Override
	public int getUsrGriwthValueCount(UsrGriwthValueCriteria example) {
		return griwthValueMapper.countByExample(example);
	}

}
