package com.ai.slp.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.bankinfo.param.InsertBankInfoRequest;
import com.ai.slp.user.api.bankinfo.param.InsertBankInfoResponse;
import com.ai.slp.user.api.bankinfo.param.QueryBankInfoRequest;
import com.ai.slp.user.api.bankinfo.param.QueryBankInfoResponse;
import com.ai.slp.user.api.bankinfo.param.UpdateBankInfoRequest;
import com.ai.slp.user.dao.mapper.bo.UcBankInfo;
import com.ai.slp.user.dao.mapper.bo.UcBankInfoCriteria;
import com.ai.slp.user.service.atom.interfaces.IUcBankInfoAtomSV;
import com.ai.slp.user.service.business.interfaces.IUcBankInfoBusiSV;
import com.ai.slp.user.util.DateUtils;

@Service
@Transactional
public class UcBankInfoBusiSVImpl implements IUcBankInfoBusiSV {

    @Autowired
    private IUcBankInfoAtomSV ucBankInfoAtomSV;

    @Override
    public InsertBankInfoResponse insertBankInfo(InsertBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException {
        UcBankInfo ucBankInfo = new UcBankInfo();
        BeanUtils.copyProperties(bankInfoRequest, ucBankInfo);
        ucBankInfo.setCreateTime(DateUtils.currTimeStamp());
        Integer responseId = 0;
        try {
            responseId = ucBankInfoAtomSV.insert(ucBankInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        InsertBankInfoResponse response = new InsertBankInfoResponse();
        response.setResponseId(responseId);
        return response;
    }

    @Override
    public void UpdateBankInfo(UpdateBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException {
        UcBankInfo bankInfo = new UcBankInfo();
        BeanUtils.copyProperties(bankInfoRequest, bankInfo);
        UcBankInfoCriteria example = new UcBankInfoCriteria();
        UcBankInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(bankInfoRequest.getTenantId());
        criteria.andUserIdEqualTo(bankInfoRequest.getUserId());
        criteria.andBankSeqIdEqualTo(bankInfoRequest.getBankSeqId());
        try {
            ucBankInfoAtomSV.updateByExampleSelective(bankInfo, example);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public PageInfo<QueryBankInfoResponse> queryBankInfo(QueryBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException {
        UcBankInfoCriteria example = new UcBankInfoCriteria();
        UcBankInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(bankInfoRequest.getTenantId());
        criteria.andUserIdEqualTo(bankInfoRequest.getUserId());
        int count = ucBankInfoAtomSV.countByExample(example);
        Integer pageNo = bankInfoRequest.getPageNo();
        Integer pageSize = bankInfoRequest.getPageSize();
        List<UcBankInfo> list = new ArrayList<UcBankInfo>();
        list = ucBankInfoAtomSV.selectByExample(example);
        QueryBankInfoResponse response = new QueryBankInfoResponse();
        PageInfo<QueryBankInfoResponse> pageInfo = new PageInfo<QueryBankInfoResponse>();
        List<QueryBankInfoResponse> responseList = new ArrayList<QueryBankInfoResponse>();
        for (UcBankInfo ucBankInfo : list) {
            BeanUtils.copyProperties(ucBankInfo, response);
            responseList.add(response);
        }
        pageInfo.setCount(count);
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
        pageInfo.setResult(responseList);
        return pageInfo;
    }

}
