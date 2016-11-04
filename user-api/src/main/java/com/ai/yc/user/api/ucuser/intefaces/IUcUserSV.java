package com.ai.yc.user.api.ucuser.intefaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.ucuser.param.SearchUserRequest;
import com.ai.yc.user.api.ucuser.param.SearchUserResponse;
import com.ai.yc.user.api.ucuser.param.UpdateUserInfoRequest;

@Path("/ucUserservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IUcUserSV {

    /**
     * 根据UserId进行查询
     * @param request
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangyh7
     * @ApiDocMethod
     * @ApiCode 
     * @RestRelativeURL ucUserservice/queryBaseInfo
     */
    @POST
    @Path("/queryBaseInfo")
    SearchUserResponse queryBaseInfo(SearchUserRequest accountQueryRequest) throws BusinessException,SystemException;
    
    /**
     * 更新用户基本信息
     * @param request
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangyh7
     * @ApiDocMethod
     * @ApiCode UAC_0015
     * @RestRelativeURL ucUserservice/updateBaseInfo
     */
    @POST
    @Path("/updateBaseInfo")
    BaseResponse updateBaseInfo(UpdateUserInfoRequest request) throws BusinessException,SystemException;
}
