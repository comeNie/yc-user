package com.ai.yc.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.components.idps.IDPSClientFactory;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sdk.util.UUIDUtil;
import com.ai.paas.ipaas.image.IImageClient;
import com.ai.slp.balance.api.accountmaintain.interfaces.IAccountMaintainSV;
import com.ai.slp.balance.api.accountmaintain.param.RegAccReq;
import com.ai.yc.common.api.country.interfaces.IGnCountrySV;
import com.ai.yc.common.api.country.param.CountryRequest;
import com.ai.yc.common.api.country.param.CountryResponse;
import com.ai.yc.ucenter.api.members.interfaces.IUcMembersSV;
import com.ai.yc.ucenter.api.members.param.UcMembersResponse;
import com.ai.yc.ucenter.api.members.param.editpass.UcMembersEditPassRequest;
import com.ai.yc.ucenter.api.members.param.register.UcMembersRegisterRequest;
import com.ai.yc.ucenter.api.members.param.register.UcMembersRegisterResponse;
import com.ai.yc.user.api.userservice.param.CompleteUserInfoRequest;
import com.ai.yc.user.api.userservice.param.InsertYCContactRequest;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.QueryUserDetailRequest;
import com.ai.yc.user.api.userservice.param.QueryUserDetailRespones;
import com.ai.yc.user.api.userservice.param.QueryUserRequest;
import com.ai.yc.user.api.userservice.param.QueryUserResponse;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.UsrContactMessage;
import com.ai.yc.user.api.userservice.param.UsrGriwthValueInfo;
import com.ai.yc.user.api.userservice.param.YCUsrUserVO;
import com.ai.yc.user.api.userservice.param.YCInsertContactResponse;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslationCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslationCriteria.Criteria;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrContactCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValue;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValueCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;
import com.ai.yc.user.service.atom.interfaces.IYCUserCollectionAtomSV;
import com.ai.yc.user.service.atom.interfaces.IYCUserContactAtomSV;
import com.ai.yc.user.service.atom.interfaces.IYCUserGriwthValueAtomSV;
import com.ai.yc.user.service.atom.interfaces.IYCUserServiceAtomSV;
import com.ai.yc.user.service.business.interfaces.IYCUserServiceBusiSV;
import com.ai.yc.user.util.UCDateUtils;
import com.alibaba.fastjson.JSON;

@Service
@Transactional
public class YCUserServiceBusiSVImpl implements IYCUserServiceBusiSV {

	private static final Log LOG = LogFactory.getLog(YCUserServiceBusiSVImpl.class);

	@Autowired
	private IYCUserServiceAtomSV ycUSAtomSV;
	@Autowired
	private IYCUserContactAtomSV ycUCAtomSV;
	@Autowired
	private IYCUserGriwthValueAtomSV ycUGVAtomSV;
	@Autowired
	private IYCUserCollectionAtomSV ycUCollectionAtomSV;

	/**
	 * resultCode 0 fail 1 success
	 */
	@Override
	public YCInsertUserResponse insertUserInfo(InsertYCUserRequest insertinfo) throws BusinessException {
		if (StringUtil.isBlank(insertinfo.getRegip())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户ip不能为空");
		}

		if (StringUtil.isBlank(insertinfo.getLoginway())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "登录方式不能为空");
		} else {
			if (insertinfo.getLoginway().equals("1")) {
				if (StringUtil.isBlank(insertinfo.getEmail())) {
					throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "邮箱不能为空");
				}
			}
			if (insertinfo.getLoginway().equals("2")) {
				if (StringUtil.isBlank(insertinfo.getMobilePhone())) {
					throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "手机号不能为空");
				}
				if (StringUtil.isBlank(insertinfo.getUserId())) {
					LOG.debug("手机验证码注册时用户ID不能为空");
					throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "手机动态码不正确");
				}
				if (StringUtil.isBlank(insertinfo.getOperationcode())) {
					LOG.debug("手机验证码注册时Operationcode不能为空");
					throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "手机动态码不正确");
				}
			}
		}

		IUcMembersSV iUcMembersSV = DubboConsumerFactory.getService(IUcMembersSV.class);
		if ("1".equals(insertinfo.getLoginway())) {
			// 孟博注册接口

			UcMembersRegisterRequest umrr = new UcMembersRegisterRequest();
			umrr.setRegip(insertinfo.getRegip());
			umrr.setOperationcode(insertinfo.getOperationcode());
			umrr.setUsername(insertinfo.getUserName());
			umrr.setEmail(insertinfo.getEmail());
			umrr.setMobilephone(insertinfo.getMobilePhone());
			umrr.setPassword(insertinfo.getPassword());
			umrr.setUsersource("gtcom");
			umrr.setLoginmode("0");
			umrr.setLoginway(insertinfo.getLoginway());
			umrr.setCreatetime(UCDateUtils.getSystime() + "");
			UcMembersRegisterResponse umrResponse = null;
			umrResponse = iUcMembersSV.ucRegisterMember(umrr);
			LOG.info("调用ucenter服务完毕----------");
			if (umrResponse == null) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "返回值为空");
			}
			if (!umrResponse.getMessage().isSuccess()) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT,
						"内部错误 : " + umrResponse.getCode().getCodeMessage());
			}
			if (umrResponse.getCode().getCodeNumber().intValue() != 1) {
				throw new BusinessException(umrResponse.getCode().getCodeNumber() + "", "ucenter返回值 : "
						+ umrResponse.getCode().getCodeNumber() + " --- " + umrResponse.getCode().getCodeMessage());
			}
			if (StringUtil.isBlank(umrResponse.getDate().get("uid").toString())) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "ucenter返回值缺少uid");
			}
			if (StringUtil.isBlank(umrResponse.getDate().get("username").toString())) { // 邮箱注册必有值
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "ucenter返回值缺少username");
			}
			if (StringUtil.isBlank(umrResponse.getDate().get("operationcode").toString())) { // 邮箱注册必有值
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "ucenter返回值缺少operationcode");
			}
			LOG.info("创建ucenter账号成功-----------" + JSON.toJSONString(umrResponse));
			// 支付账户信息
			IAccountMaintainSV iAccountMaintainSV = DubboConsumerFactory.getService(IAccountMaintainSV.class);
			RegAccReq vo = new RegAccReq();
			vo.setExternalId(UUIDUtil.genId32());// 外部流水号ID
			vo.setSystemId("Cloud-UAC_WEB");// 系统ID
			vo.setTenantId("yeecloud");// 租户ID
			vo.setRegCustomerId(umrResponse.getDate().get("uid").toString());
			vo.setAcctName(umrResponse.getDate().get("username").toString());

			/**
			 * 个人客户需校验支付密码
			 */
			vo.setPayCheck("1");
			/**
			 * 1、预付费 0、后付费
			 */
			vo.setAcctType("1");

			long accountId = iAccountMaintainSV.createAccount(vo);
			LOG.info("创建个人账户成功----------------" + JSON.toJSONString(vo));
			// 插入数据
			UsrUser tUser = new UsrUser();
			// 从右到左,把相同类型且属性名相同的复制到右边
			BeanUtils.copyProperties(tUser, insertinfo);
			tUser.setUserId(umrResponse.getDate().get("uid").toString());
			tUser.setNickname("译粉_" + SeqUtil.getNewId("YC_USER$NIKE_NAME_ID$SEQ", 8));
			tUser.setAccountId(accountId);
			try {
				ycUSAtomSV.insertUserInfo(tUser);
			} catch (Exception e) {
				throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
			}
			LOG.info("创建个人信息成功-----------");
			YCInsertUserResponse insertResp = new YCInsertUserResponse();
			insertResp.setUserId(tUser.getUserId());
			insertResp.setOperationcode(umrResponse.getDate().get("operationcode").toString());
			insertResp.setUsername(umrResponse.getDate().get("username").toString());
			LOG.info("返回数据------------" + JSON.toJSONString(insertResp));
			return insertResp;
		} else if (insertinfo.getLoginway().equals("2")) {// 思路：前台调用ucGetOperationcode接口，然后这里调用UcMembersEditPassRequest接口修改密码，与邮箱注册不同的是前台必须要传uid和Operationcod过来
			// ----------------------
			// IUcMembersOperationSV iUcMembersOperationSV =
			// DubboConsumerFactory.getService(IUcMembersOperationSV.class);
			// UcMembersGetOperationcodeRequest ucMembersGetOperationcodeRequest
			// = new UcMembersGetOperationcodeRequest();
			// ucMembersGetOperationcodeRequest.setUserinfo(insertinfo.getMobilePhone());
			// ucMembersGetOperationcodeRequest.setOperationtype("1");
			// UcMembersGetOperationcodeResponse umgor =
			// iUcMembersOperationSV.ucGetOperationcode(ucMembersGetOperationcodeRequest);
			// umgor.getDate().get("uid");
			// umgor.getDate().get("operationcode");
			// ----------------------
			UsrUser user;
			try {
				user = ycUSAtomSV.getUserInfo(insertinfo.getUserId());
			} catch (Exception e) {
				throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
			}
			if (null != user) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "UID 已经存在");
			}
			UcMembersEditPassRequest umepr = new UcMembersEditPassRequest();
			umepr.setUid(Integer.valueOf(insertinfo.getUserId()));
			umepr.setChecke_code(insertinfo.getOperationcode());
			umepr.setChecke_mode("2");
			umepr.setNewpw(insertinfo.getPassword());

			// //----------------------
			// umepr.setChecke_code(umgor.getDate().get("operationcode").toString());
			// umepr.setUid(Integer.valueOf(umgor.getDate().get("uid").toString()));
			// insertinfo.setUserId(umgor.getDate().get("uid").toString());
			// //----------------------
			UcMembersResponse umr = iUcMembersSV.ucEditPassword(umepr);
			if (umr == null) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "返回值为NULL");
			}
			if (umr.getMessage() == null) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "返回值为NULL");
			}
			if (!umr.getMessage().isSuccess()) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "ucenter 内部错误");
			}
			if (umr.getCode().getCodeNumber().intValue() != 1) {
				throw new BusinessException(umr.getCode().getCodeNumber() + "", umr.getCode().getCodeMessage());
			}
			if (StringUtil.isBlank(umr.getDate().get("username").toString())) { // 邮箱注册必有值,ucenter返回值缺少username
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "内部错误 缺少username");
			}
			LOG.info("修改密码成功-------------" + JSON.toJSONString(umepr));
			// 支付账户信息
			IAccountMaintainSV iAccountMaintainSV = DubboConsumerFactory.getService(IAccountMaintainSV.class);
			RegAccReq vo = new RegAccReq();
			vo.setExternalId(UUIDUtil.genId32());// 外部流水号ID
			vo.setSystemId("Cloud-UAC_WEB");// 系统ID
			vo.setTenantId("yeecloud");// 租户ID
			vo.setRegCustomerId(insertinfo.getUserId());
			vo.setAcctName(umr.getDate().get("username").toString());
			/**
			 * 个人客户需校验支付密码
			 */
			vo.setPayCheck("1");
			vo.setAcctType("1");// 1预付费
			long accountId = iAccountMaintainSV.createAccount(vo);
			LOG.info("创建账号成功-----------------");
			// 插入数据
			UsrUser tUser = new UsrUser();
			// 从右到左,把相同类型且属性名相同的复制到右边
			LOG.info("个人信息insertinfo" + JSON.toJSONString(insertinfo));
			BeanUtils.copyProperties(tUser, insertinfo);
			tUser.setAccountId(accountId);
			tUser.setNickname("译粉_" + SeqUtil.getNewId("YC_USER$NIKE_NAME_ID$SEQ", 8));
			try {
				ycUSAtomSV.insertUserInfo(tUser);
			} catch (Exception e) {
				throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
			}
			LOG.info("创建个人信息---------------" + JSON.toJSONString(tUser));
			YCInsertUserResponse insertResp = new YCInsertUserResponse();
			insertResp.setUserId(tUser.getUserId());
			LOG.info("返回数据------------------------" + JSON.toJSONString(insertResp));
			return insertResp;

		} else {
			return null;
		}

	}

	@Override
	public int updateUserInfo(UpdateYCUserRequest userparam) throws BusinessException {
		if (StringUtil.isBlank(userparam.getUserId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户Id不能为空");
		}
		UsrUser user = new UsrUser();
		BeanUtils.copyProperties(user, userparam);
		UsrUserCriteria example = new UsrUserCriteria();
		UsrUserCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(user.getUserId());
		int resp;
		try {
			resp = ycUSAtomSV.updateUserInfo(user, example);
		} catch (Exception e) {
			throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
		}
		return resp;

	}

	@Override
	public YCUserInfoResponse searchUserInfo(String userID) throws BusinessException {
		if (StringUtil.isBlank(userID)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户Id不能为空");
		}
		UsrUser usrUser;
		try {
			usrUser = ycUSAtomSV.getUserInfo(userID);
		} catch (Exception e) {
			throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
		}
		YCUserInfoResponse result = new YCUserInfoResponse();
		if (null == usrUser) {
			return result;
		}
		BeanUtils.copyProperties(result, usrUser);
		
		if(result.getGriwthValue()==null||result.getGriwthValue()!=null&&result.getGriwthValue()>=0 && result.getGriwthValue()<=5999){
			result.setGriwthLevelEN("Regular Members");
			result.setGriwthLevelZH("普通会员");
		}else if(result.getGriwthValue()!=null&&result.getGriwthValue()<=14999){
			result.setGriwthLevelEN("VIP Member");
			result.setGriwthLevelZH("VIP会员");
		}else if(result.getGriwthValue()!=null&&result.getGriwthValue()<=29999){
			result.setGriwthLevelEN("SVIP Member");
			result.setGriwthLevelZH("SVIP会员");
		}else{
			result.setGriwthLevelEN("SVIP Platinum Member");
			result.setGriwthLevelZH("SVIP白金会员");
		}
		
		String idpsns = "yc-portal-web";
		IImageClient im = IDPSClientFactory.getImageClient(idpsns);
		if (usrUser.getPortraitId() != null && !"".equals(usrUser.getPortraitId())) {
			String url = im.getImageUrl(usrUser.getPortraitId(), ".jpg", "100x100");
			result.setUrl(url);
		}
		return result;
	}

	@Override
	public List<UsrContact> searchUsrContactInfo(String userId) throws BusinessException {

		if (StringUtil.isBlank(userId)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户Id不能为空");
		}
		List<UsrContact> usrC;
		try {
			usrC = ycUSAtomSV.getUsrContactInfo(userId);
		} catch (Exception e) {
			throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
		}
		if (null == usrC) {
			return null;
		}
		IGnCountrySV iGnCountrySV = DubboConsumerFactory.getService(IGnCountrySV.class);
		for (UsrContact contact : usrC) {
			CountryRequest cr = new CountryRequest();
			cr.setTenantId("yeecloud");
//			cr.setCountryCode(String.valueOf(contact.getGnCountryId()));
			cr.setId(contact.getGnCountryId());
			CountryResponse cresp = iGnCountrySV.queryCountry(cr);
			if (null != cresp.getResult()) {
				if (null != cresp.getResult().get(0)) {
					contact.setCountryVo(cresp.getResult().get(0));
				}
			}
		}
		return usrC;
	}

	@Override
	public UsrUser searchuserInfoByNickName(String nickName) throws BusinessException {
		if (StringUtil.isBlank(nickName)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "昵称不能为空");
		}
		UsrUserCriteria example = new UsrUserCriteria();
		UsrUserCriteria.Criteria criteria = example.createCriteria();
		criteria.andNicknameEqualTo(nickName);
		UsrUser user;
		try {
			user = ycUSAtomSV.getUserInfoByNickName(example);
		} catch (Exception e) {
			throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
		}
		if (null == user) {
			return null;
		}
		return user;
	}

	@Override
	public YCInsertContactResponse insertContactInfo(InsertYCContactRequest creq) throws BusinessException {
		UsrContact usrContact = new UsrContact();
		String contactId = null;
		if (null != creq.getContactId() && !StringUtil.isBlank(creq.getContactId())) {
			// delete
			try {
				ycUSAtomSV.deleteContactInfo(creq.getContactId());
			} catch (Exception e) {
				throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
			}
			contactId = creq.getContactId();
		} else {
			contactId = SeqUtil.getNewId("YC_USER$CONTACT_ID$SEQ", 8);
		}
		if (creq.getGnCountryId() < 1) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "国家编号不能为空");
		}
		if (StringUtil.isBlank(creq.getUserId())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户ID不能为空");
		}
		BeanUtils.copyProperties(usrContact, creq);
		usrContact.setContactId(contactId);
		try {
			ycUSAtomSV.insertContactInfo(usrContact);
		} catch (Exception e) {
			throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
		}
		YCInsertContactResponse icr = new YCInsertContactResponse();
		icr.setContactId(contactId);
		return icr;
	}

	@Override
	public List<YCUserInfoResponse> getAllUserInfo() throws BusinessException {
		List<YCUserInfoResponse> list = new ArrayList<YCUserInfoResponse>();
		List<UsrUser> usrList;
		try {
			usrList = ycUSAtomSV.getAllUserInfo();
		} catch (Exception e) {
			throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
		}
		for (UsrUser usrUser : usrList) {
			YCUserInfoResponse userInfoResponse = new YCUserInfoResponse();
			BeanUtils.copyProperties(userInfoResponse, usrUser);
			list.add(userInfoResponse);
		}
		return list;
	}

	@Override
	public BaseResponse completeUserInfo(CompleteUserInfoRequest userinfo) throws BusinessException {
		ResponseHeader responseHeader = null;
		BaseResponse response = new BaseResponse();
		try {
			// 支付账户信息
			IAccountMaintainSV iAccountMaintainSV = DubboConsumerFactory.getService(IAccountMaintainSV.class);
			RegAccReq vo = new RegAccReq();
			vo.setExternalId(UUIDUtil.genId32());// 外部流水号ID
			vo.setSystemId("Cloud-UAC_WEB");// 系统ID
			vo.setTenantId("yeecloud");// 租户ID
			vo.setRegCustomerId(userinfo.getUserId());
			vo.setAcctName(userinfo.getLoginName());

			/**
			 * 个人客户需校验支付密码
			 */
			vo.setPayCheck("1");
			/**
			 * 1、预付费 0、后付费
			 */
			vo.setAcctType("1");

			long accountId = iAccountMaintainSV.createAccount(vo);
			LOG.info("创建个人账户成功----------------");
			// 插入数据
			UsrUser tUser = new UsrUser();
			// 从右到左,把相同类型且属性名相同的复制到右边
			BeanUtils.copyProperties(tUser, userinfo);
			tUser.setUserId(userinfo.getUserId());
			if ("".equals(tUser.getNickname()) || tUser.getNickname() == null) {
				tUser.setNickname("译粉_" + SeqUtil.getNewId("YC_USER$NIKE_NAME_ID$SEQ", 8));
				userinfo.setNickname(tUser.getNickname());
			}
			tUser.setAccountId(accountId);
			try {
				ycUSAtomSV.insertUserInfo(tUser);
			} catch (Exception e) {
				throw new BusinessException(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
			}
			LOG.info("创建个人信息成功-----------");
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "补全信息成功");
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {
			LOG.error("补全信息失败", e);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SYSTEM_ERROR, "补全信息失败");
			response.setResponseHeader(responseHeader);
		}

		return response;
	}
	@Override
	public QueryUserResponse searchUserPage(QueryUserRequest request)
			throws BusinessException {

		QueryUserResponse response = new QueryUserResponse();
		UsrUserCriteria example = new UsrUserCriteria();
		example.setLimitStart((request.getPageNo() - 1) * request.getPageSize());
		example.setLimitEnd(request.getPageSize());
		UsrUserCriteria.Criteria criteria = example.createCriteria();
		if (!StringUtil.isBlank(request.getNickname())) {
			criteria.andNicknameLike("%"+request.getNickname()+"%");
		}
		if (!StringUtil.isBlank(request.getMobilePhone())) {
			criteria.andMobilePhoneEqualTo(request.getMobilePhone());
		}
		if (!StringUtil.isBlank(request.getUserId())) {
			criteria.andUserIdEqualTo(request.getUserId());
		}
		if (!StringUtil.isBlank(request.getUsersource())) {
			criteria.andUsersourceEqualTo(request.getUsersource());
		}
		if (!StringUtil.isBlank(request.getSafetyLevel())) {
			if(request.getSafetyLevel().equals("1")){
				criteria.andGriwthValueBetween(0, 5999);
			}else if(request.getSafetyLevel().equals("2")){
				criteria.andGriwthValueBetween(6000, 14999);
			}else if(request.getSafetyLevel().equals("3")){
				criteria.andGriwthValueBetween(15000, 29999);
			}else if(request.getSafetyLevel().equals("4")){
				criteria.andGriwthValueGreaterThan(30000);
			}
		}
		if (null != request.getState()) {
			criteria.andStateEqualTo(request.getState());
		}
		if (null != request.getIsTranslator()) {
			criteria.andIsTranslatorEqualTo(request.getIsTranslator());
		}
		if (null != request.getRegistTimeStart()
				&& null != request.getRegistTimeStart()) {
			criteria.andRegistTimeBetween(request.getRegistTimeStart(),
					request.getRegistTimeEnd());
		}
		List<UsrUser> usrUserList = ycUSAtomSV.getUserInfo(example);
		List<YCUsrUserVO> results = new ArrayList<YCUsrUserVO>();
		if (!CollectionUtil.isEmpty(usrUserList)) {
			for (UsrUser user : usrUserList) {
				YCUsrUserVO userVO = new YCUsrUserVO();
				if(user.getGriwthValue()==null||user.getGriwthValue()!=null&&user.getGriwthValue()>=0 && user.getGriwthValue()<=5999){
					user.setSafetyLevel("普通会员");
				}else if(user.getGriwthValue()!=null&&user.getGriwthValue()<=14999){
					user.setSafetyLevel("VIP会员");
				}else if(user.getGriwthValue()!=null&&user.getGriwthValue()<=29999){
					user.setSafetyLevel("SVIP会员");
				}else{
					user.setSafetyLevel("SVIP白金会员");
				}
				BeanUtils.copyProperties(userVO, user);
				results.add(userVO);
			}
		}
		PageInfo<YCUsrUserVO> pageinfo = new PageInfo<YCUsrUserVO>();
		pageinfo.setResult(results);
		pageinfo.setPageSize(request.getPageSize());
		pageinfo.setPageNo(request.getPageNo());
		pageinfo.setCount(ycUSAtomSV.countByExample(example));
		response.setPageInfo(pageinfo);
		return response;
	}

	@Override
	public QueryUserDetailRespones queryUserDetail(
			QueryUserDetailRequest request) throws BusinessException {
		QueryUserDetailRespones response = new QueryUserDetailRespones();
		UsrUser user = ycUSAtomSV.getUserInfo(request.getUserId());
		if(null != user){
			YCUsrUserVO usrUserInfo = new YCUsrUserVO();
			BeanUtils.copyProperties(usrUserInfo, user);
			//设置收藏数
			UsrCollectionTranslationCriteria example1 = new UsrCollectionTranslationCriteria();
			UsrCollectionTranslationCriteria.Criteria criteria1 = example1.createCriteria();
			criteria1.andUserIdEqualTo(usrUserInfo.getUserId());
			int collectionCount = ycUCollectionAtomSV.getCollectionCount(example1);
			usrUserInfo.setCollectCount(collectionCount);
			
			//头像
			String idpsns = "yc-portal-web";
			IImageClient im = IDPSClientFactory.getImageClient(idpsns);
			String url = im.getImageUrl(usrUserInfo.getPortraitId(), ".jpg", "40x20");
			usrUserInfo.setPortraitId(url);
			
			if(usrUserInfo.getGriwthValue()==null||usrUserInfo.getGriwthValue()!=null&&usrUserInfo.getGriwthValue()>=0 && usrUserInfo.getGriwthValue()<=5999){
				usrUserInfo.setSafetyLevel("普通会员");
			}else if(usrUserInfo.getGriwthValue()!=null&&usrUserInfo.getGriwthValue()<=14999){
				usrUserInfo.setSafetyLevel("VIP会员");
			}else if(usrUserInfo.getGriwthValue()!=null&&usrUserInfo.getGriwthValue()<=29999){
				usrUserInfo.setSafetyLevel("SVIP会员");
			}else{
				usrUserInfo.setSafetyLevel("SVIP白金会员");
			}
			
			response.setUsrUser(usrUserInfo);
			UsrContactCriteria example = new UsrContactCriteria();
			UsrContactCriteria.Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(request.getUserId());
			List<UsrContact> usrContactList = ycUCAtomSV.queryContactInfo(example);
			if(!CollectionUtil.isEmpty(usrContactList)){
				List<UsrContactMessage> UsrGriwthValueInfoList = new ArrayList<UsrContactMessage>();
				for(UsrContact usrContact:usrContactList){
					UsrContactMessage usrContactInfo = new UsrContactMessage();
					BeanUtils.copyProperties(usrContactInfo, usrContact);
					UsrGriwthValueInfoList.add(usrContactInfo);
				}
				response.setUsrContact(UsrGriwthValueInfoList);
			}
			UsrGriwthValueCriteria example2 = new UsrGriwthValueCriteria();
			UsrGriwthValueCriteria.Criteria criteria2  = example2.createCriteria();
			criteria2.andUserIdEqualTo(request.getUserId());
			List<UsrGriwthValue> usrGriwthValueList = ycUGVAtomSV.queryGriwthValueInfo(example2);
			if(!CollectionUtil.isEmpty(usrGriwthValueList)){
				List<UsrGriwthValueInfo> UsrGriwthValueInfoList = new ArrayList<UsrGriwthValueInfo>();
				for(UsrGriwthValue usrGriwthValue :usrGriwthValueList){
					UsrGriwthValueInfo UsrGriwthValueInfo = new UsrGriwthValueInfo();
					BeanUtils.copyProperties(UsrGriwthValueInfo, usrGriwthValue);
					UsrGriwthValueInfoList.add(UsrGriwthValueInfo);
				}
				response.setUsrGriwthValueList(UsrGriwthValueInfoList);
			}
			return response;
		}
		return response;
	}
}
