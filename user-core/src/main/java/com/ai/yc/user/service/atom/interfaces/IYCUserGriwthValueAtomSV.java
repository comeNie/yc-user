package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import com.ai.yc.user.dao.mapper.bo.UsrGriwthValue;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValueCriteria;

public interface IYCUserGriwthValueAtomSV {

	public int insertGriwthValueInfo(UsrGriwthValue griwthValueInfo);
	public int updateGriwthValueInfo(UsrGriwthValue griwthValuetInfo);
	public List<UsrGriwthValue> queryGriwthValueInfo(UsrGriwthValueCriteria example);
	public int getUsrGriwthValueCount(UsrGriwthValueCriteria example);
}
