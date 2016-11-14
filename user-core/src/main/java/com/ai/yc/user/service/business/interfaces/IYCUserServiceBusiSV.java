package com.ai.yc.user.service.business.interfaces;


import com.ai.opt.base.exception.BusinessException;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCLSPInfoReponse;
import com.ai.yc.user.api.userservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;
import com.ai.yc.user.api.userservice.param.searchYCLSPInfoRequest;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrTranslator;
import com.ai.yc.user.dao.mapper.bo.UsrUser;

public interface IYCUserServiceBusiSV {
    
    public YCInsertUserResponse insertUserInfo(InsertYCUserRequest user) throws BusinessException;
    
    public int updateUserInfo(UpdateYCUserRequest updateUserParams) throws BusinessException;

    public YCUserInfoResponse searchUserInfo(String userID) throws BusinessException;

	public UsrTranslator searchYCUsrTranslatorInfo(String userId) throws BusinessException;

	public UsrContact searchUsrContactInfo(String userId) throws BusinessException;
	
	public UsrUser searchuserInfoByNickName(String userId) throws BusinessException;

	public YCTranslatorSkillListResponse getTranslatorSkillList(String userId) throws BusinessException;

	public YCLSPInfoReponse searchLSPInfoBussiness(searchYCLSPInfoRequest searchLSPParams);
}
