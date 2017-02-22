package com.ai.yc.user.service.business.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.usercontact.param.UserContactInfoRespose;
import com.ai.yc.user.dao.mapper.bo.UsrContact;

public interface IYCUserContactBusiSV {
	public BaseResponse insertContactInfo(UsrContact contactInfo);
	public BaseResponse updateContactInfo(UsrContact contactInfo);
	public BaseResponse deleteContactInfo(String contactId);
	public UserContactInfoRespose queryContactInfo(String userId);
	public BaseResponse updateContactDefaultMode(UsrContact contactInfo);
}
