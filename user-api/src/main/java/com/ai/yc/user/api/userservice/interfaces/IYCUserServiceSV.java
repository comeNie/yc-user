package com.ai.yc.user.api.userservice.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.userservice.param.CompleteUserInfoRequest;
import com.ai.yc.user.api.userservice.param.InsertYCContactRequest;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.QueryUserDetailRequest;
import com.ai.yc.user.api.userservice.param.QueryUserDetailRespones;
import com.ai.yc.user.api.userservice.param.QueryUserRequest;
import com.ai.yc.user.api.userservice.param.QueryUserResponse;
import com.ai.yc.user.api.userservice.param.SearchYCContactRequest;
import com.ai.yc.user.api.userservice.param.SearchYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.YCContactInfoResponse;
import com.ai.yc.user.api.userservice.param.YCInsertContactResponse;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCUpdateUserResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;


@Path("/ycuserservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserServiceSV {


	/**
	 * 新增用户信息基本数据
	 * @param 
	 * @return
	 * @ApiCode USR_0001
     * @RestRelativeURL ycuserservice/insertYCUser
	 */
	@POST
	@Path("/insertYCUser")
	YCInsertUserResponse insertYCUser(InsertYCUserRequest registerParamsRequest);
	/**
	 * 修改用户基本信息数据
	 * 只填修改的属性
	 * @param 
	 * @return
	 * @ApiCode USR_0003
     * @RestRelativeURL ycuserservice/updateUserBaseInfo
	 */
	@POST
	@Path("/updateYCUserInfo")
	YCUpdateUserResponse updateYCUserInfo(UpdateYCUserRequest updateUserParams) ;
	/**
	 * 查询用户基本信息数据
	 * @param 
	 * @return
	 * @ApiCode USR_0002
     * @RestRelativeURL ycuserservice/searchYCUserInfo
	 */
	@POST
	@Path("/searchYCUserInfo")
	YCUserInfoResponse searchYCUserInfo(SearchYCUserRequest ucUser) ;

	/**
	 * 通过昵称查询基本信息
	 * @param 
	 * @return
	 * @ApiCode USR_0008
     * @RestRelativeURL ycuserservice/searchUserInfoByNickName
	 */
	@POST
	@Path("/searchUserInfoByNickName")
	public YCUserInfoResponse searchUserInfoByNickName(String nickName);
	

	/**
	 * 查询译员通讯录
	 * @param 
	 * @return
	 * @ApiCode USR_0005
     * @RestRelativeURL ycuserservice/searchYCContactInfo
	 */
	@POST
	@Path("/searchYCContactInfo")
	YCContactInfoResponse searchYCContactInfo(SearchYCContactRequest cUsrId);
	/**
	 * 添加译员通讯录
	 * @param 
	 * @return
	 * @ApiCode USR_0007
     * @RestRelativeURL ycuserservice/insertYCContactInfo
	 */
	@POST
	@Path("/insertYCContactInfo")
	YCInsertContactResponse insertYCContact(InsertYCContactRequest creq);

	/**
	 * 查询所有用户
	 * @param 
	 * @return
	 * @ApiCode USR_0007
     * @RestRelativeURL ycuserservice/getAllUserInfo
	 */
	@POST
	@Path("/getAllUserInfo")
	public List<YCUserInfoResponse> getAllUserInfo();

	/**
	 * 如果登录的用户名客户中心没有则补全一条
	 * @param 
	 * @return
	 * @ApiCode USR_0007
     * @RestRelativeURL ycuserservice/completeUserInfo
	 */
	@POST
	@Path("/completeUserInfo")
	public BaseResponse completeUserInfo(CompleteUserInfoRequest request);
	
	/**
	 * 查询会员列表
	 * @param request
	 * @return
	 * @RestRelativeURL ycuserservice/queryUserPage
	 */
	@POST
	@Path("/queryUserPage")
	public QueryUserResponse queryUserPage(QueryUserRequest request) throws BusinessException, SystemException;
	/**
	 * 查询会员详情
	 * @param request
	 * @return
	 * @RestRelativeURL ycuserservice/queryUserDetail
	 */
	@POST
	@Path("/queryUserDetail")
	public QueryUserDetailRespones queryUserDetail(QueryUserDetailRequest request) throws BusinessException, SystemException;

}
