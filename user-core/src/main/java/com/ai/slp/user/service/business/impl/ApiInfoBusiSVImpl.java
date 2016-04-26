package com.ai.slp.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
    private IApiInfoAtomSV iApiInfoAtomSV;

    @Override
    public CreateUserFavoriteResponse insertApiInfo(CreateApiInfoRequest saveApiInfoRequest)
            throws BusinessException, SystemException {
        UcApiInfo ucApiInfo = new UcApiInfo();
        ucApiInfo.setApiInfo(saveApiInfoRequest.getApiInfo());
        ucApiInfo.setApiName(saveApiInfoRequest.getApiName());
        ucApiInfo.setApiSeqId(saveApiInfoRequest.getApiSeqId());
        ucApiInfo.setApiType(saveApiInfoRequest.getApiType());
        ucApiInfo.setContactEmail(saveApiInfoRequest.getContactEmail());
        ucApiInfo.setContactMp(saveApiInfoRequest.getContactMp());
        ucApiInfo.setContactName(saveApiInfoRequest.getContactName());
        ucApiInfo.setTenantId(saveApiInfoRequest.getTenantId());
        ucApiInfo.setUserId(Long.parseLong(saveApiInfoRequest.getUserId().toString()));
        ucApiInfo.setWebAddr(saveApiInfoRequest.getWebAddr());
        ucApiInfo.setIpAddr(saveApiInfoRequest.getIpAddr());
        ucApiInfo.setCreateChlId(saveApiInfoRequest.getCreateChlId());
        ucApiInfo.setCreateOperId(Long.parseLong(saveApiInfoRequest.getCreateOperId().toString()));
        ucApiInfo.setCreateTime(DateUtils.currTimeStamp());
        ucApiInfo.setOperService(saveApiInfoRequest.getOperService());
        int responseId=0;
        try {
            responseId = iApiInfoAtomSV.insert(ucApiInfo);
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
        ucApiInfo.setApiKey(ucApiInfoParams.getApiKey());
        ucApiInfo.setSecretKey(ucApiInfoParams.getSecretKey());
        ucApiInfo.setUpdateChlId(ucApiInfoParams.getUpdateChlId());
        ucApiInfo.setUpdateOperId(Long.parseLong(ucApiInfoParams.getUpdateOperId().toString()));
        ucApiInfo.setUpdateTime(DateUtils.currTimeStamp());
        
        UcApiInfoCriteria example = new UcApiInfoCriteria();
        UcApiInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(ucApiInfoParams.getTenantId());
        criteria.andUserIdEqualTo(Long.parseLong(ucApiInfoParams.getUserId().toString()));
        criteria.andApiSeqIdEqualTo(ucApiInfoParams.getApiSeqId());
        
        try {
            iApiInfoAtomSV.updateByExampleSelective(ucApiInfo, example);
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
        
        int count = iApiInfoAtomSV.countByExample(example);
        Integer pageNo = apiInfoRequest.getPageNo();
        Integer pageSize = apiInfoRequest.getPageSize();
        List<UcApiInfo> list = new ArrayList<UcApiInfo>();
        list = iApiInfoAtomSV.selectByExample(example);
        List<ApiInfoResponse> responseList = new ArrayList<ApiInfoResponse>();
        ApiInfoResponse response = new ApiInfoResponse();
        for (UcApiInfo ucApiInfo : list) {
            response.setApiInfo(ucApiInfo.getApiInfo());
            response.setApiKey(ucApiInfo.getApiKey());
            response.setApiName(ucApiInfo.getApiName());
            response.setApiSeqId(ucApiInfo.getApiSeqId());
            response.setApiType(ucApiInfo.getApiType());
            response.setContactAddress(ucApiInfo.getContactAddress());
            response.setContactCretNum(ucApiInfo.getContactCertNum());
            response.setContactCretType(ucApiInfo.getContactCertType());
            response.setContactDept(ucApiInfo.getContactDept());
            response.setContactEmail(ucApiInfo.getContactEmail());
            response.setContactMp(ucApiInfo.getContactMp());
            response.setContactName(ucApiInfo.getContactName());
            response.setContactWxId(ucApiInfo.getContactWxId());
            response.setCreateChlId(ucApiInfo.getCreateChlId());
            response.setCreateOperId(ucApiInfo.getCreateOperId().toString());
            response.setCreateTime(ucApiInfo.getCreateTime());
            response.setGroupZip(ucApiInfo.getGroupZip());
            response.setIpAddr(ucApiInfo.getIpAddr());
            response.setOperService(ucApiInfo.getOperService());
            response.setRemark(ucApiInfo.getRemark());
            response.setSecretKey(ucApiInfo.getSecretKey());
            response.setTenantId(ucApiInfo.getTenantId());
            response.setUpdateChlId(ucApiInfo.getUpdateChlId());
            response.setUpdateOperId(ucApiInfo.getUpdateOperId().toString());
            response.setUpdateTime(ucApiInfo.getUpdateTime());
            response.setUserId(ucApiInfo.getUserId().intValue());
            response.setWebAddr(ucApiInfo.getWebAddr());
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
