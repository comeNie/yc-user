package com.ai.yc.user.service.business.interfaces;


import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.userservice.param.CompleteUserInfoRequest;
import com.ai.yc.user.api.userservice.param.InsertYCContactRequest;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.QueryUserDetailRequest;
import com.ai.yc.user.api.userservice.param.QueryUserDetailRespones;
import com.ai.yc.user.api.userservice.param.QueryUserRequest;
import com.ai.yc.user.api.userservice.param.QueryUserResponse;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.YCInsertContactResponse;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrUser;

public interface IYCUserServiceBusiSV {
    
    public YCInsertUserResponse insertUserInfo(InsertYCUserRequest user) throws BusinessException;
    
    public int updateUserInfo(UpdateYCUserRequest updateUserParams) throws BusinessException;

    public YCUserInfoResponse searchUserInfo(String userID) throws BusinessException;

//	public UsrTranslator searchYCUsrTranslatorInfo(SearchYCTranslatorRequest searchReq) throws BusinessException;

	public List<UsrContact> searchUsrContactInfo(String userId) throws BusinessException;
	
	public UsrUser searchuserInfoByNickName(String userId) throws BusinessException;

//	public YCTranslatorSkillListResponse getTranslatorSkillList(String userId) throws BusinessException;

//	public YCLSPInfoReponse searchLSPInfoBussiness(searchYCLSPInfoRequest searchLSPParams) throws BusinessException;

	public YCInsertContactResponse insertContactInfo(InsertYCContactRequest creq) throws BusinessException;
	public List<YCUserInfoResponse> getAllUserInfo()throws BusinessException;
	
	public BaseResponse completeUserInfo(CompleteUserInfoRequest userinfo) throws BusinessException;

	public QueryUserResponse searchUserPage(QueryUserRequest request) throws BusinessException;
    
    public QueryUserDetailRespones queryUserDetail(QueryUserDetailRequest request) throws BusinessException;

}
