package com.ai.yc.user.api.usercontact.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.usercontact.param.UserContactInfoRequest;
import com.ai.yc.user.api.usercontact.param.UserContactInfoRespose;

@Path("/ycusercontact")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserContactSV {
	/**
	 * 新增用户联系人数据
	 * @param 
	 * @return
	 * @ApiCode USR_0001
     * @RestRelativeURL ycusercontact/insertContactInfo
	 */
	@POST
	@Path("/insertContactInfo")
	public BaseResponse insertContactInfo(UserContactInfoRequest contactInfo)throws BusinessException,SystemException;
	
	/**
	 * 更新用户联系人数据
	 * @param 
	 * @return
	 * @ApiCode USR_0001
     * @RestRelativeURL ycusercontact/insertContactInfo
	 */
	@POST
	@Path("/updateContactInfo")
	public BaseResponse updateContactInfo(UserContactInfoRequest contactInfo)throws BusinessException,SystemException;
	
	/**
	 * 删除用户联系人数据
	 * @param 
	 * @return
	 * @ApiCode USR_0001
     * @RestRelativeURL ycusercontact/deleteContactInfo
	 */
	@POST
	@Path("/deleteContactInfo")
	public BaseResponse deleteContactInfo(String contactId)throws BusinessException,SystemException;
	
	/**
	 * 查询联系人数据
	 * @param 
	 * @return
	 * @ApiCode USR_0001
     * @RestRelativeURL ycusercontact/queryContactInfo
	 */
	@POST
	@Path("/queryContactInfo")
	public UserContactInfoRespose queryContactInfo(String userId)throws BusinessException,SystemException;
	/**
	 * 更新联系方式是否默认
	 * @param 
	 * @return
	 * @ApiCode USR_0001
     * @RestRelativeURL ycusercontact/updateContactDefaultMode
	 */
	@POST
	@Path("/updateContactDefaultMode")
	public BaseResponse updateContactDefaultMode(UserContactInfoRequest contactInfo)throws BusinessException,SystemException;
}
