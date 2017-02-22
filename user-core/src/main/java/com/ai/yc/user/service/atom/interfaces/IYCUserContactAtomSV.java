package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrContactCriteria;

public interface IYCUserContactAtomSV {
	public int insertContactInfo(UsrContact contactInfo);
	public int updateContactInfo(UsrContact contactInfo);
	public int deleteContactInfo(String contactId);
	public List<UsrContact> queryContactInfo(UsrContactCriteria example);
	public int updateContactDefaultMode(UsrContact contactInfo);
	public int getContactCount(UsrContactCriteria example);
}
