package com.ai.slp.user.api.apiinfo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.apiinfo.interfaces.IApiInfoSV;
import com.ai.slp.user.api.apiinfo.param.ApiInfoRequest;
import com.ai.slp.user.api.apiinfo.param.ApiInfoResponse;
import com.ai.slp.user.api.apiinfo.param.CreateApiInfoRequest;
import com.ai.slp.user.api.apiinfo.param.UcApiInfoParams;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteResponse;
import com.ai.slp.user.service.business.interfaces.IApiInfoBusiSV;

@Service
@Transactional
public class ApiInfoSVImpl implements IApiInfoSV {

    @Autowired
    private IApiInfoBusiSV apiInfoBusiSV;
    
    @Override
    public CreateUserFavoriteResponse insertApiInfo(CreateApiInfoRequest saveApiInfoRequest)
            throws BusinessException, SystemException {
        return apiInfoBusiSV.insertApiInfo(saveApiInfoRequest);
    }

    @Override
    public void updateApiInfo(UcApiInfoParams ucApiInfoParams)
            throws BusinessException, SystemException {
        apiInfoBusiSV.updateApiInfo(ucApiInfoParams);
    }

    @Override
    public PageInfo<ApiInfoResponse> queryApiInfo(ApiInfoRequest apiInfoRequest)
            throws BusinessException, SystemException {
        return apiInfoBusiSV.queryApiInfo(apiInfoRequest);
    }

}
