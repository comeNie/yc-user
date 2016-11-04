package com.ai.yc.user.api.register.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.user.api.register.param.DeleteYCUserParams;
import com.ai.yc.user.api.register.param.InsertYCUserRequest;
import com.ai.yc.user.api.register.param.SearchYCContactUserId;
import com.ai.yc.user.api.register.param.SearchYCTranslatorUserId;
import com.ai.yc.user.api.register.param.SearchYCUserListParams;
import com.ai.yc.user.api.register.param.SearchYCUserParams;
import com.ai.yc.user.api.register.param.UpdateYCUserParams;
import com.ai.yc.user.api.register.param.YCContactInfo;
import com.ai.yc.user.api.register.param.YCDeleteUserResponse;
import com.ai.yc.user.api.register.param.YCInsertUserResponse;
import com.ai.yc.user.api.register.param.YCTranslatorInfo;
import com.ai.yc.user.api.register.param.YCUpdateUserResponse;
import com.ai.yc.user.api.register.param.YCUserInfo;
import com.ai.yc.user.api.register.param.YCUserInfoList;


@Path("/ycservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserServiceSV {


	/**
	 * @param 
	 * @return
	 * @ApiCode USR_0001
     * @RestRelativeURL ycservice/register/user
	 */
	@POST
	@Path("/register/user")
	YCInsertUserResponse insertYCUser(InsertYCUserRequest registerParamsRequest);
	/**
	 * @param 
	 * @return
	 * @ApiCode USR_0003
     * @RestRelativeURL ycservice/adduserbaseinfo
	 */
	@POST
	@Path("/adduserbaseinfo")
	YCUpdateUserResponse updateYCUserInfo(UpdateYCUserParams updateUserParams) ;
	/**
	 * @param 
	 * @return
	 * @ApiCode USR_0002
     * @RestRelativeURL ycservice/getusercenterbaseinfo
	 */
	@POST
	@Path("/getusercenterbaseinfo")
	YCUserInfo searchYCUserInfo(SearchYCUserParams ucUser) ;

	/**
	 * @param 
	 * @return
	 * @ApiCode USR_0004
     * @RestRelativeURL ycservice/gettranslatorinfobyuserid
	 */
	@POST
	@Path("/gettranslatorinfobyuserid")
	YCTranslatorInfo searchYCTranslatorInfoById(SearchYCTranslatorUserId tUsrId);
	
	/**
	 * @param 
	 * @return
	 * @ApiCode USR_0005
     * @RestRelativeURL ycservice/getcontactinfobyuserid
	 */
	@POST
	@Path("/getcontactinfobyuserid")
	YCContactInfo searchYCContactInfoById(SearchYCContactUserId cUsrId);
	
//	@POST
//	@Path("/searchYCUserList")
//	YCUserInfoList searchYCUserList(SearchYCUserListParams ucUser) throws BusinessException, SystemException;
//
//	@POST
//	@Path("/deleteYCUser")
//	YCDeleteUserResponse deleteYCUser(DeleteYCUserParams ucUser) throws BusinessException, SystemException;
}
