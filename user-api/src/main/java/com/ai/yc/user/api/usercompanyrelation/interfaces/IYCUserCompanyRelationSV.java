package com.ai.yc.user.api.usercompanyrelation.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoRequest;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoResponse;
import com.ai.yc.user.api.usercompanyrelation.param.CompanyRelationResponse;
import com.ai.yc.user.api.usercompanyrelation.param.UserCompanyRelationPageInfoRequest;

@Path("/ycusercompanyrelation")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserCompanyRelationSV {
	/**
	 * 新增企业关系信息
	 * @param 
	 * @return
	 * @ApiCode USR_0008
     * @RestRelativeURL ycusercompanyrelation/insertCompanyRelatInfo
	 */
	@POST
	@Path("/insertCompanyRelationInfo")
	public BaseResponse insertCompanyRelationInfo(UserCompanyInfoRequest userInfoRequest)throws BusinessException,SystemException;

	/**
	 * 修改企业信息
	 * @param 
	 * @return
	 * @ApiCode USR_0007
     * @RestRelativeURL ycusercompanyrelation/updateCompanyRelationInfo
	 */
	@POST
	@Path("/updateCompanyRelationInfo")
	public BaseResponse updateCompanyRelationInfo(UserCompanyInfoRequest userInfoRequest)throws BusinessException,SystemException;

	/**
	 * 获取企业成员
	 * @param 
	 * @return
	 * @ApiCode USR_0007
     * @RestRelativeURL ycusercompanyrelation/getCompanyUsers
	 */
	@POST
	@Path("/getCompanyUsers")
	public CompanyRelationResponse getCompanyUsers(UserCompanyRelationPageInfoRequest pageInfoRequest);
	
}
