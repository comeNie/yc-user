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
import com.ai.yc.user.api.register.param.SearchYCUserListParams;
import com.ai.yc.user.api.register.param.SearchYCUserParams;
import com.ai.yc.user.api.register.param.UpdateYCUserParams;
import com.ai.yc.user.api.register.param.YCDeleteUserResponse;
import com.ai.yc.user.api.register.param.YCInsertUserResponse;
import com.ai.yc.user.api.register.param.YCUpdateUserResponse;
import com.ai.yc.user.api.register.param.YCUserInfo;
import com.ai.yc.user.api.register.param.YCUserInfoList;


@Path("/registerservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCRegisterSV {


	/**
	 * @param registerParamsRequest
	 * @return
	 * @ApiCode 
     * @RestRelativeURL registerservice/insertYCUser
	 */
	@POST
	@Path("/insertYCUser")
	YCInsertUserResponse insertYCUser(InsertYCUserRequest registerParamsRequest);
	/**
	 * @param registerParamsRequest
	 * @return
	 * @ApiCode 
     * @RestRelativeURL registerservice/updateYCUserInfo
	 */
	@POST
	@Path("/updateYCUserInfo")
	YCUpdateUserResponse updateYCUserInfo(UpdateYCUserParams updateUserParams) ;
	/**
	 * @param registerParamsRequest
	 * @return
	 * @ApiCode 
     * @RestRelativeURL registerservice/searchYCUserInfo
	 */
	@POST
	@Path("/searchYCUserInfo")
	YCUserInfo searchYCUserInfo(SearchYCUserParams ucUser) ;

//	@POST
//	@Path("/searchYCUserList")
//	YCUserInfoList searchYCUserList(SearchYCUserListParams ucUser) throws BusinessException, SystemException;
//
//	@POST
//	@Path("/deleteYCUser")
//	YCDeleteUserResponse deleteYCUser(DeleteYCUserParams ucUser) throws BusinessException, SystemException;
}
