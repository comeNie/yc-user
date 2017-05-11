package com.ai.yc.user.api.usercontact.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.user.api.usercontact.interfaces.IYCUserContactSV;
import com.ai.yc.user.api.usercontact.param.UserContactInfoRequest;
import com.ai.yc.user.api.usercontact.param.UserContactInfoRespose;
import com.ai.yc.user.api.usercontact.param.UserContactResponse;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.service.business.interfaces.IYCUserContactBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
@Service
@Component
public class YCUserContactSVImpl implements IYCUserContactSV{
	@Autowired
	private IYCUserContactBusiSV ycUsrContactBusiSv;
	@Override
	@POST
	@Path("/insertContactInfo")
	public BaseResponse insertContactInfo(UserContactInfoRequest contactInfo) {
		UsrContact userContact = new UsrContact();
		String contactId = SeqUtil.getNewId("YC_USER$CONTACT_ID$SEQ", 8);
		BeanUtils.copyProperties(userContact, contactInfo);
		userContact.setContactId(contactId);
		return ycUsrContactBusiSv.insertContactInfo(userContact);
	}

	@Override
	@POST
	@Path("/updateContactInfo")
	public BaseResponse updateContactInfo(UserContactInfoRequest contactInfo) {
		UsrContact userContact = new UsrContact();
		BeanUtils.copyProperties(userContact, contactInfo);
		return ycUsrContactBusiSv.updateContactInfo(userContact);
	}

	@Override
	@POST
	@Path("/deleteContactInfo")
	public BaseResponse deleteContactInfo(String contactId) {
		return ycUsrContactBusiSv.deleteContactInfo(contactId);
	}

	@Override
	@POST
	@Path("/queryContactInfo")
	public UserContactInfoRespose queryContactInfo(String userId) {
		return ycUsrContactBusiSv.queryContactInfo(userId);
	}

	@Override
	@POST
	@Path("/updateContactDefaultMode")
	public BaseResponse updateContactDefaultMode(
			UserContactInfoRequest contactInfo) {
		UsrContact userContact = new UsrContact();
		BeanUtils.copyProperties(userContact, contactInfo);
		return ycUsrContactBusiSv.updateContactDefaultMode(userContact);
	}

	@Override
	@POST
	@Path("/queryContactByCid")
	public UserContactResponse queryContactByCid(String contactId)
			throws BusinessException, SystemException {
		return ycUsrContactBusiSv.queryContactInfoByCId(contactId);
	}

	@Override
	@POST
	@Path("/checnUserName")
	public UserContactResponse checkUserName(String userName)
			throws BusinessException, SystemException {
		return ycUsrContactBusiSv.checkUserName(userName);
	}

	@Override
	@POST
	@Path("/queryContactByCid")
	public UserContactResponse checnUserEmail(String userEmail)
			throws BusinessException, SystemException {
		return ycUsrContactBusiSv.checkUserEmail(userEmail);
	}

	@Override
	@POST
	@Path("/checnUserEmail")
	public UserContactResponse checnUserPhone(String userPhone)
			throws BusinessException, SystemException {
		return ycUsrContactBusiSv.checkUserPhone(userPhone);
	}

}
