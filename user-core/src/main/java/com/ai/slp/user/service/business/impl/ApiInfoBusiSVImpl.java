package com.ai.slp.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.apiinfo.param.ApiInfoRequest;
import com.ai.slp.user.api.apiinfo.param.ApiInfoResponse;
import com.ai.slp.user.api.apiinfo.param.CreateApiInfoRequest;
import com.ai.slp.user.api.apiinfo.param.UcApiInfoParams;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteResponse;
import com.ai.slp.user.dao.mapper.bo.UcApiInfo;
import com.ai.slp.user.dao.mapper.bo.UcApiInfoCriteria;
import com.ai.slp.user.service.atom.interfaces.IApiInfoAtomSV;
import com.ai.slp.user.service.business.interfaces.IApiInfoBusiSV;
import com.ai.slp.user.util.DateUtils;

@Service
@Transactional
public class ApiInfoBusiSVImpl implements IApiInfoBusiSV {

    private static final Log LOG = LogFactory.getLog(ApiInfoBusiSVImpl.class);

    @Autowired
    private IApiInfoAtomSV apiInfoAtomSV;

    @Override
    public CreateUserFavoriteResponse insertApiInfo(CreateApiInfoRequest createRequest)
            throws BusinessException, SystemException {
        UcApiInfo ucApiInfo = new UcApiInfo();
        
        BeanUtils.copyProperties(createRequest, ucApiInfo);
        ucApiInfo.setUserId(Long.parseLong(createRequest.getUserId().toString()));
        ucApiInfo.setCreateTime(DateUtils.currTimeStamp());
        int responseId=0;
        try {
            responseId = apiInfoAtomSV.insert(ucApiInfo);
        } catch (Exception e) {
            LOG.error("操作失败");
            e.printStackTrace();
        }
        CreateUserFavoriteResponse response = new CreateUserFavoriteResponse();
        response.setResponseId(responseId);
        return response;
    }

    @Override
    public void updateApiInfo(UcApiInfoParams ucApiInfoParams)
            throws BusinessException, SystemException {
        UcApiInfo ucApiInfo = new UcApiInfo();
        BeanUtils.copyProperties(ucApiInfoParams, ucApiInfo);
        ucApiInfo.setUpdateTime(DateUtils.currTimeStamp());
        
        UcApiInfoCriteria example = new UcApiInfoCriteria();
        UcApiInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(ucApiInfoParams.getTenantId());
        criteria.andUserIdEqualTo(Long.parseLong(ucApiInfoParams.getUserId().toString()));
        criteria.andApiSeqIdEqualTo(ucApiInfoParams.getApiSeqId());
        
        try {
            apiInfoAtomSV.updateByExampleSelective(ucApiInfo, example);
        } catch (Exception e) {
            LOG.error("更新失败");
            e.printStackTrace();
        }
    }

    @Override
    public PageInfo<ApiInfoResponse> queryApiInfo(ApiInfoRequest apiInfoRequest)
            throws BusinessException, SystemException {
        
        UcApiInfoCriteria example = new UcApiInfoCriteria();
        UcApiInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(apiInfoRequest.getTenantId());
        criteria.andUserIdEqualTo(Long.parseLong(apiInfoRequest.getUserId().toString()));
        
        int count = apiInfoAtomSV.countByExample(example);
        Integer pageNo = apiInfoRequest.getPageNo();
        Integer pageSize = apiInfoRequest.getPageSize();
        List<UcApiInfo> list = new ArrayList<UcApiInfo>();
        list = apiInfoAtomSV.selectByExample(example);
        List<ApiInfoResponse> responseList = new ArrayList<ApiInfoResponse>();
        ApiInfoResponse response = new ApiInfoResponse();
        for (UcApiInfo ucApiInfo : list) {
            BeanUtils.copyProperties(ucApiInfo, response);
            responseList.add(response);
        }
        PageInfo<ApiInfoResponse> pageInfo = new PageInfo<ApiInfoResponse>();
        pageInfo.setCount(count);
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
        pageInfo.setResult(responseList);
        return pageInfo;
    }

}
