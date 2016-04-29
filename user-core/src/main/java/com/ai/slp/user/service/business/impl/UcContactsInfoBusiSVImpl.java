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
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.user.api.contactsinfo.param.InsertContactsInfoRequest;
import com.ai.slp.user.api.contactsinfo.param.QueryContactsInfoRequest;
import com.ai.slp.user.api.contactsinfo.param.QueryContactsInfoResponse;
import com.ai.slp.user.api.contactsinfo.param.UpdateContactsInfoRequest;
import com.ai.slp.user.dao.mapper.bo.UcContactsInfo;
import com.ai.slp.user.dao.mapper.bo.UcContactsInfoCriteria;
import com.ai.slp.user.service.atom.interfaces.IUcContactsInfoAtomSV;
import com.ai.slp.user.service.business.interfaces.IUcContactsInfoBusiSV;
import com.ai.slp.user.util.DateUtils;

@Service
@Transactional
public class UcContactsInfoBusiSVImpl implements IUcContactsInfoBusiSV {

    private static final Log LOG = LogFactory.getLog(UcContactsInfoBusiSVImpl.class);

    @Autowired
    private IUcContactsInfoAtomSV ucContactsInfoAtomSV;

    @Override
    public BaseResponse insertContactsInfo(InsertContactsInfoRequest contactsInfoRequest)
            throws BusinessException, SystemException {
        UcContactsInfo ucContactsInfo = new UcContactsInfo();
        BeanUtils.copyProperties(contactsInfoRequest, ucContactsInfo);
        ucContactsInfo.setCreateTime(DateUtils.currTimeStamp());

        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader;
        try {
            ucContactsInfoAtomSV.insert(ucContactsInfo);
            responseHeader = new ResponseHeader(true, "success", "添加成功");
        } catch (Exception e) {
            LOG.error("添加失败", e);
            responseHeader = new ResponseHeader(false, "fail", "添加失败");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }

    @Override
    public BaseResponse updateContactsInfo(UpdateContactsInfoRequest contactsInfoRequest)
            throws BusinessException, SystemException {
        UcContactsInfo ucContactsInfo = new UcContactsInfo();
        BeanUtils.copyProperties(contactsInfoRequest, ucContactsInfo);
        ucContactsInfo.setUpdateTime(DateUtils.currTimeStamp());

        UcContactsInfoCriteria example = new UcContactsInfoCriteria();
        UcContactsInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(contactsInfoRequest.getTenantId());
        criteria.andUserIdEqualTo(contactsInfoRequest.getUserId());
        criteria.andContactSeqIdEqualTo(contactsInfoRequest.getContactSeqId());
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader;
        try {
            ucContactsInfoAtomSV.updateByExampleSelective(ucContactsInfo, example);
            responseHeader = new ResponseHeader(true, "success", "更新成功");
        } catch (Exception e) {
            LOG.error("更新失败", e);
            responseHeader = new ResponseHeader(false, "fail", "更新失败");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }

    @Override
    public PageInfo<QueryContactsInfoResponse> queryContactsInfo(
            QueryContactsInfoRequest contactsInfoRequest)
                    throws BusinessException, SystemException {
        UcContactsInfoCriteria example = new UcContactsInfoCriteria();
        UcContactsInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(contactsInfoRequest.getTenantId());
        criteria.andUserIdEqualTo(contactsInfoRequest.getUserId());

        QueryContactsInfoResponse response = new QueryContactsInfoResponse();
        List<QueryContactsInfoResponse> responseList = new ArrayList<QueryContactsInfoResponse>();
        ResponseHeader responseHeader;

        Integer pageNo = contactsInfoRequest.getPageNo();
        Integer pageSize = contactsInfoRequest.getPageSize();
        List<UcContactsInfo> list = new ArrayList<UcContactsInfo>();
        int count = 0;
        try {
            count = ucContactsInfoAtomSV.countByExample(example);
            list = ucContactsInfoAtomSV.selectByExample(example);
            responseHeader = new ResponseHeader(true, "success", "查询成功");
        } catch (Exception e) {
            LOG.error("查询失败", e);
            responseHeader = new ResponseHeader(false, "fail", "查询失败");
        }
        for (UcContactsInfo ucContactsInfo : list) {
            BeanUtils.copyProperties(ucContactsInfo, response);
            responseList.add(response);
        }
        PageInfo<QueryContactsInfoResponse> pageInfo = new PageInfo<QueryContactsInfoResponse>();
        response.setResponseHeader(responseHeader);
        pageInfo.setCount(count);
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
        pageInfo.setResult(responseList);
        return pageInfo;
    }

}
