package com.ai.yc.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.sdk.components.idps.IDPSClientFactory;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.paas.ipaas.image.IImageClient;
import com.ai.yc.ucenter.api.members.interfaces.IUcMembersOperationSV;
import com.ai.yc.ucenter.api.members.interfaces.IUcMembersSV;
import com.ai.yc.ucenter.api.members.param.UcMembersResponse;
import com.ai.yc.ucenter.api.members.param.UcMembersVo;
import com.ai.yc.ucenter.api.members.param.editpass.UcMembersEditPassRequest;
import com.ai.yc.ucenter.api.members.param.get.UcMembersGetRequest;
import com.ai.yc.ucenter.api.members.param.get.UcMembersGetResponse;
import com.ai.yc.ucenter.api.members.param.opera.UcMembersGetOperationcodeRequest;
import com.ai.yc.ucenter.api.members.param.opera.UcMembersGetOperationcodeResponse;

import com.ai.yc.ucenter.api.members.param.register.UcMembersRegisterRequest;
import com.ai.yc.ucenter.api.members.param.register.UcMembersRegisterResponse;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.UsrLanguageMessage;
import com.ai.yc.user.api.userservice.param.UsrLspMessage;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCLSPInfoReponse;
import com.ai.yc.user.api.userservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;
import com.ai.yc.user.api.userservice.param.searchYCLSPInfoRequest;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrLanguage;
import com.ai.yc.user.dao.mapper.bo.UsrLanguageCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrLsp;
import com.ai.yc.user.dao.mapper.bo.UsrLspCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrTranslator;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;
import com.ai.yc.user.service.atom.interfaces.IYCUserServiceAtomSV;
import com.ai.yc.user.service.business.interfaces.IYCUserServiceBusiSV;
import com.ai.yc.user.util.UCDateUtils;

@Service
@Transactional
public class YCUserServiceBusiSVImpl implements IYCUserServiceBusiSV {

	private static final Log LOG = LogFactory.getLog(YCUserServiceBusiSVImpl.class);

	@Autowired
	public IYCUserServiceAtomSV ycUSAtomSV;

	/**
	 * resultCode 0 fail 1 success
	 */
	@Override
	public YCInsertUserResponse insertUserInfo(InsertYCUserRequest insertinfo) throws BusinessException {
		if (StringUtil.isBlank(insertinfo.getRegip())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户ip不能为空");
		}

		if (StringUtil.isBlank(insertinfo.getLoginway())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户名不能为空");
		} else {
			if (insertinfo.getLoginway().equals("1")) {
				if (StringUtil.isBlank(insertinfo.getEmail())) {
					throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户名不能为空");
				}
			}
			if (insertinfo.getLoginway().equals("2")) {
				if (StringUtil.isBlank(insertinfo.getMobilePhone())) {
					throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:手机号不能为空");
				}
				if (StringUtil.isBlank(insertinfo.getUserId())) {
					throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:手机验证码注册时用户ID不能为空");
				}
			}
		}

		if (StringUtil.isBlank(insertinfo.getUserName())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户名不能为空");
		}

		if (StringUtil.isBlank(insertinfo.getNickname())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:昵称不能为空");
		}

		IUcMembersSV iUcMembersSV = DubboConsumerFactory.getService(IUcMembersSV.class);
		if (insertinfo.getLoginway().equals("1")) {
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
			if (umrResponse == null) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "用户中心请求失败 : 返回值为NULL");
			}
			if (!umrResponse.getMessage().isSuccess()) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "用户中心请求失败 : 内部错误");
			}
			if (umrResponse.getCode().getCodeNumber().intValue() != 1) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "用户中心请求失败 ucenter返回值 : "
						+ umrResponse.getCode().getCodeNumber() + " --- " + umrResponse.getCode().getCodeMessage());
			}
			if (StringUtil.isBlank(umrResponse.getDate().get("uid").toString())) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "用户中心请求失败 ucenter返回值缺少uid");
			}
			if (StringUtil.isBlank(umrResponse.getDate().get("operationcode").toString())) { // 邮箱注册必有值
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "用户中心请求失败 ucenter返回值缺少operationcode");
			}

			// 插入数据
			UsrUser tUser = new UsrUser();
			// 从右到左,把相同类型且属性名相同的复制到右边
			BeanUtils.copyProperties(tUser, insertinfo);
			// String UserId =
			// SeqUtil.getNewId(UserSequenceCode.CM_CUST_FILE_EXT$INFO_EXT$ID,18);
			// Map respMap = umrResponse.getDate();
			// UcMembersVo vo = new UcMembersVo(respMap);
			tUser.setUserId(umrResponse.getDate().get("uid").toString());
			ycUSAtomSV.insertUserInfo(tUser);
			// 支付账户信息

			YCInsertUserResponse insertResp = new YCInsertUserResponse();
			insertResp.setUserId(tUser.getUserId());
			insertResp.setOperationcode(umrResponse.getDate().get("operationcode").toString());
			return insertResp;
		} else if (insertinfo.getLoginway().equals("2")) {
			// 思路：前台调用ucGetOperationcode接口，然后这里调用UcMembersEditPassRequest接口修改密码，与邮箱注册不同的是前台必须要传uid和Operationcod过来
			IUcMembersOperationSV iUcMembersOperationSV = DubboConsumerFactory.getService(IUcMembersOperationSV.class);
			UcMembersGetOperationcodeRequest ucMembersGetOperationcodeRequest = new UcMembersGetOperationcodeRequest();
			ucMembersGetOperationcodeRequest.setUserinfo(insertinfo.getMobilePhone());
			ucMembersGetOperationcodeRequest.setOperationtype("1");
			UcMembersGetOperationcodeResponse umgor = iUcMembersOperationSV.ucGetOperationcode(ucMembersGetOperationcodeRequest);
			umgor.getDate().get("uid");
			umgor.getDate().get("operationcode");
			
			
			UcMembersEditPassRequest umepr = new UcMembersEditPassRequest();
			umepr.setUid(Integer.valueOf(insertinfo.getUserId()));
			umepr.setChecke_code(insertinfo.getOperationcode());
			umepr.setChecke_mode("2");
			umepr.setNewpw(insertinfo.getPassword());
			
			UcMembersResponse umr = iUcMembersSV.ucEditPassword(umepr);
			if (umr == null) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "用户中心请求失败 : 返回值为NULL");
			}
			if (!umr.getMessage().isSuccess()) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "用户中心请求失败 : 内部错误");
			}
			if (umr.getCode().getCodeNumber().intValue() != 1) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "用户中心请求失败 ucenter返回值 : "
						+ umr.getCode().getCodeNumber() + " --- " + umr.getCode().getCodeMessage());
			}

			// 插入数据
			UsrUser tUser = new UsrUser();
			// 从右到左,把相同类型且属性名相同的复制到右边
			BeanUtils.copyProperties(tUser, insertinfo);
			ycUSAtomSV.insertUserInfo(tUser);
			// 支付账户信息

			YCInsertUserResponse insertResp = new YCInsertUserResponse();
			insertResp.setUserId(tUser.getUserId());
			return insertResp;

		} else {
			return null;
		}

	}

	@Override
	public int updateUserInfo(UpdateYCUserRequest userparam) throws BusinessException {
		if (StringUtil.isBlank(userparam.getUserId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户Id不能为空");
		}

		if (StringUtil.isBlank(userparam.getNickname())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:昵称不能为空");
		}

		if (StringUtil.isBlank(userparam.getUserName())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户名不能为空");
		}

		UsrUser user = new UsrUser();
		BeanUtils.copyProperties(user, userparam);
		UsrUserCriteria example = new UsrUserCriteria();
		UsrUserCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(user.getUserId());
		return ycUSAtomSV.updateUserInfo(user, example);

	}

	@Override
	public YCUserInfoResponse searchUserInfo(String userID) throws BusinessException {
		if (StringUtil.isBlank(userID)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户Id不能为空");
		}
		UsrUser usrUser = ycUSAtomSV.getUserInfo(userID);
		
		YCUserInfoResponse result = new YCUserInfoResponse();
		BeanUtils.copyProperties(result,usrUser);
		String idpsns = "yc-portal-web";
		IImageClient im = IDPSClientFactory.getImageClient(idpsns);
		if(usrUser.getPortraitId()!=null&&!"".equals(usrUser.getPortraitId())){
			String url = im.getImageUrl(usrUser.getPortraitId(), ".jpg", "100x100");
			result.setUrl(url);
		}
		IUcMembersSV iUcMembersSV = DubboConsumerFactory.getService(IUcMembersSV.class);
		UcMembersGetRequest ucMembersGetRequest = new UcMembersGetRequest();
		ucMembersGetRequest.setUsername(usrUser.getUserId());
		ucMembersGetRequest.setGetmode("1");
		UcMembersGetResponse ucMembersGetResponse = iUcMembersSV.ucGetMember(ucMembersGetRequest);
		if(null == ucMembersGetResponse.getDate().get("username")){
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "用户中心请求失败 ucenter返回值 : "
					+ ucMembersGetResponse.getCode().getCodeNumber() + " --- " + ucMembersGetResponse.getCode().getCodeMessage());
		}
		String userName = ucMembersGetResponse.getDate().get("username").toString();
		
		result.setUsername(userName);
		
		return result;
	}

	@Override
	public UsrTranslator searchYCUsrTranslatorInfo(String userId) throws BusinessException {
		if (StringUtil.isBlank(userId)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户Id不能为空");
		}

		UsrTranslator utr = ycUSAtomSV.getUsrTranslatorInfo(userId);
		return utr;
	}

	@Override
	public UsrContact searchUsrContactInfo(String userId) throws BusinessException {

		if (StringUtil.isBlank(userId)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户Id不能为空");
		}

		UsrContact usrC = ycUSAtomSV.getUsrContactInfo(userId);
		return usrC;
	}

	@Override
	public UsrUser searchuserInfoByNickName(String nickName) throws BusinessException {
		if (StringUtil.isBlank(nickName)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:昵称不能为空");
		}
		UsrUserCriteria example = new UsrUserCriteria();
		UsrUserCriteria.Criteria criteria = example.createCriteria();
		criteria.andNicknameEqualTo(nickName);
		return ycUSAtomSV.getUserInfoByNickName(example);
	}

	@Override
	public YCTranslatorSkillListResponse getTranslatorSkillList(String userId) throws BusinessException {
		if (StringUtil.isBlank(userId)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户ID不能为空");
		}
		YCTranslatorSkillListResponse translatorSkillList = new YCTranslatorSkillListResponse();
		// UsrUser验证译员信息
		UsrUser userinfo = ycUSAtomSV.getUserInfo(userId);
		if (userinfo.getIsRanslator() != 1) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "查询失败: 用户非译员身份");
		}
		// 获取译员信息
		UsrTranslator utr = searchYCUsrTranslatorInfo(userId);
		BeanUtils.copyProperties(translatorSkillList, utr);
		// 获取技能列表
		UsrLanguageCriteria example = new UsrLanguageCriteria();
		UsrLanguageCriteria.Criteria criteria = example.createCriteria();
		criteria.andTranslatorIdEqualTo(userId);
		List<UsrLanguage> usrLanguageList = ycUSAtomSV.getUsrLanguageList(example);
		translatorSkillList.setUsrLanguageList(changUsrLanguageToUsrLanguageMessage(usrLanguageList));
		return translatorSkillList;
	}

	private List<UsrLanguageMessage> changUsrLanguageToUsrLanguageMessage(List<UsrLanguage> usrLanguageList) {
		List<UsrLanguageMessage> ulmList = new ArrayList<UsrLanguageMessage>();
		for (UsrLanguage ul : usrLanguageList) {
			UsrLanguageMessage ulm = new UsrLanguageMessage();
			BeanUtils.copyProperties(ulm, ul);
			ulmList.add(ulm);
		}
		return ulmList;
	}

	@Override
	public YCLSPInfoReponse searchLSPInfoBussiness(searchYCLSPInfoRequest params) {
		UsrLsp usrLsp = null;
		YCLSPInfoReponse yclspRep = new YCLSPInfoReponse();
		yclspRep.setLspId(params.getLspId());
		yclspRep.setLspName(params.getLspName());
		List<UsrLsp> usrLspList = new ArrayList<UsrLsp>();
		if (!StringUtil.isBlank(params.getLspId()) && StringUtil.isBlank(params.getLspName())) {
			usrLsp = ycUSAtomSV.searchLspById(params.getLspId());
			usrLspList.add(usrLsp);
			yclspRep.setUsrLspList(changUsrLspToUsrLspMessage(usrLspList));
		}
		if (StringUtil.isBlank(params.getLspId()) && !StringUtil.isBlank(params.getLspName())) {
			UsrLspCriteria example = new UsrLspCriteria();
			UsrLspCriteria.Criteria criteria = example.createCriteria();
			criteria.andLspNameLike(params.getLspName());
			usrLspList = ycUSAtomSV.searchLspByName(example);
			yclspRep.setUsrLspList(changUsrLspToUsrLspMessage(usrLspList));
		}
		if (StringUtil.isBlank(params.getLspId()) && StringUtil.isBlank(params.getLspName())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:参数不能同时为空");
		}
		if (!StringUtil.isBlank(params.getLspId()) && !StringUtil.isBlank(params.getLspName())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:参数不能同时有值");
		}
		return yclspRep;
	}

	private List<UsrLspMessage> changUsrLspToUsrLspMessage(List<UsrLsp> usrLspList) {
		List<UsrLspMessage> ulmList = new ArrayList<UsrLspMessage>();
		for (UsrLsp ul : usrLspList) {
			UsrLspMessage ulm = new UsrLspMessage();
			BeanUtils.copyProperties(ulm, ul);
			ulmList.add(ulm);
		}
		return ulmList;
	}

}
