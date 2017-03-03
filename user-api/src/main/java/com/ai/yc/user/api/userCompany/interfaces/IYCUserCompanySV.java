package com.ai.yc.user.api.userCompany.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.userCompany.param.UserCompanyInfoRequest;
import com.ai.yc.user.api.userCompany.param.UserCompanyInfoResponse;

@Path("/ycusercompany")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserCompanySV {
	/**
	 * 新增企业信息
	 * @param 
	 * @return
	 * @ApiCode USR_0007
     * @RestRelativeURL ycusercompany/insertCompanyInfo
	 */
	public BaseResponse insertCompanyInfo(UserCompanyInfoRequest userInfoRequest)throws BusinessException,SystemException;

	/**
	 * 修改企业信息
	 * @param 
	 * @return
	 * @ApiCode USR_0007
     * @RestRelativeURL ycusercompany/updateCompanyInfo
	 */
	public BaseResponse updateCompanyInfo(UserCompanyInfoRequest userInfoRequest)throws BusinessException,SystemException;

	/**
	 * 查询企业信息
	 * @param 
	 * @return
	 * @ApiCode USR_0007
     * @RestRelativeURL ycusercompany/queryCompanyInfo
	 */
	public UserCompanyInfoResponse queryCompanyInfo(UserCompanyInfoRequest userInfoRequest)throws BusinessException,SystemException;

}
