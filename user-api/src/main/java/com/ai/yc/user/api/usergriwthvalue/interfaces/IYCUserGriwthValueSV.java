package com.ai.yc.user.api.usergriwthvalue.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.usergriwthvalue.param.UserGriwthValueListResponse;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValuePageInfoRequest;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValueRequest;

@Path("/ycusergriwthvalue")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserGriwthValueSV {
		
	/**
	 * 新增成长值
	 * @param 
	 * @return
	 * @ApiCode USR_0003
     * @RestRelativeURL ycusergriwthvalue/insertGriwthValueInfo
	 */
	@POST
	@Path("/insertGriwthValueInfo")
	public BaseResponse insertGriwthValueInfo(UsrGriwthValueRequest griwthValueInfo)throws BusinessException,SystemException;
	
	/**
	 * 更新成长值
	 * @param 
	 * @return
	 * @ApiCode USR_00013
     * @RestRelativeURL ycusergriwthvalue/insertGriwthValueInfo
	 */
	@POST
	@Path("/updateGriwthValueInfo")
	public BaseResponse updateGriwthValueInfo(UsrGriwthValueRequest contactInfo)throws BusinessException,SystemException;
	
	/**
	 * 查询成长值
	 * @param 
	 * @return
	 * @ApiCode USR_00014
     * @RestRelativeURL ycusergriwthvalue/queryGriwthValueInfo
	 */
	@POST
	@Path("/queryGriwthValueInfo")
	public UserGriwthValueListResponse queryGriwthValueInfo(UsrGriwthValuePageInfoRequest contactInfo)throws BusinessException,SystemException;
}
