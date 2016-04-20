package com.ai.slp.user.api.apiinfo.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.apiinfo.param.ApiInfoRequest;
import com.ai.slp.user.api.apiinfo.param.ApiInfoResponse;
import com.ai.slp.user.api.apiinfo.param.CreateApiInfoRequest;
import com.ai.slp.user.api.apiinfo.param.UcApiInfoParams;

/**
 * 企业、代理商申请API服务 <br>
 * Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public interface IApiInfoSV {

    @interface InsertApiInfo {
    }

    /**
     * 企业、代理商申请API信息创建
     * 
     * @param saveApiInfoRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse insertApiInfo(CreateApiInfoRequest saveApiInfoRequest)
            throws BusinessException, SystemException;

    @interface UpdateApiInfo {
    }

    /**
     * 企业、代理商申请API信息更新
     * 
     * @param ucApiInfoParams
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse updateApiInfo(UcApiInfoParams ucApiInfoParams)
            throws BusinessException, SystemException;

    interface QueryApiInfo {
    }

    /**
     * 企业、代理商申请API信息查询
     * 
     * @param apiInfoRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    PageInfo<ApiInfoResponse> queryApiInfo(ApiInfoRequest apiInfoRequest)
            throws BusinessException, SystemException;
}
