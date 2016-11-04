package com.ai.yc.user.api.userservice.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.SearchYCContactRequest;
import com.ai.yc.user.api.userservice.param.SearchYCTranslatorRequest;
import com.ai.yc.user.api.userservice.param.SearchYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.YCContactInfoResponse;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCTranslatorInfoResponse;
import com.ai.yc.user.api.userservice.param.YCUpdateUserResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;


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
     * @RestRelativeURL ycservice/updateUserBaseInfo
	 */
	@POST
	@Path("/updateUserBaseInfo")
	YCUpdateUserResponse updateYCUserInfo(UpdateYCUserRequest updateUserParams) ;
	/**
	 * @param 
	 * @return
	 * @ApiCode USR_0002
     * @RestRelativeURL ycservice/searchYCUserInfo
	 */
	@POST
	@Path("/searchYCUserInfo")
	YCUserInfoResponse searchYCUserInfo(SearchYCUserRequest ucUser) ;

	/**
	 * @param 
	 * @return
	 * @ApiCode USR_0004
     * @RestRelativeURL ycservice/searchYCTranslatorInfo
	 */
	@POST
	@Path("/searchYCTranslatorInfo")
	YCTranslatorInfoResponse searchYCTranslatorInfo(SearchYCTranslatorRequest tUsrId);
	
	/**
	 * @param 
	 * @return
	 * @ApiCode USR_0005
     * @RestRelativeURL ycservice/searchYCContactInfo
	 */
	@POST
	@Path("/searchYCContactInfo")
	YCContactInfoResponse searchYCContactInfo(SearchYCContactRequest cUsrId);
	
}
