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
import com.ai.slp.user.api.bankinfo.param.InsertBankInfoRequest;
import com.ai.slp.user.api.bankinfo.param.QueryBankInfoRequest;
import com.ai.slp.user.api.bankinfo.param.QueryBankInfoResponse;
import com.ai.slp.user.api.bankinfo.param.UcBankInfoParams;
import com.ai.slp.user.api.bankinfo.param.UpdateBankInfoRequest;
import com.ai.slp.user.dao.mapper.bo.UcBankInfo;
import com.ai.slp.user.dao.mapper.bo.UcBankInfoCriteria;
import com.ai.slp.user.service.atom.interfaces.IUcBankInfoAtomSV;
import com.ai.slp.user.service.business.interfaces.IUcBankInfoBusiSV;
import com.ai.slp.user.util.DateUtils;
import com.ai.slp.user.util.SequenceUtil;

@Service
@Transactional
public class UcBankInfoBusiSVImpl implements IUcBankInfoBusiSV {

    static final Log LOG = LogFactory.getLog(UcBankInfoBusiSVImpl.class);

    @Autowired
    private IUcBankInfoAtomSV ucBankInfoAtomSV;

    @Override
    public BaseResponse insertBankInfo(InsertBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException {
        UcBankInfo ucBankInfo = new UcBankInfo();
        ucBankInfo.setBankSeqId(SequenceUtil.createBankSeqId());
        BeanUtils.copyProperties(bankInfoRequest, ucBankInfo);
        ucBankInfo.setCreateTime(DateUtils.currTimeStamp());
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader;
        try {
            ucBankInfoAtomSV.insert(ucBankInfo);
            responseHeader = new ResponseHeader(true, "success", "添加成功");
        } catch (Exception e) {
            LOG.error("添加失败", e);
            responseHeader = new ResponseHeader(false, "fail", "添加失败");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }

    @Override
    public BaseResponse UpdateBankInfo(UpdateBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException {
        UcBankInfo bankInfo = new UcBankInfo();
        BeanUtils.copyProperties(bankInfoRequest, bankInfo);
        UcBankInfoCriteria example = new UcBankInfoCriteria();
        UcBankInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(bankInfoRequest.getTenantId());
        criteria.andUserIdEqualTo(bankInfoRequest.getUserId());
        criteria.andBankSeqIdEqualTo(bankInfoRequest.getBankSeqId());
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader;
        try {
            ucBankInfoAtomSV.updateByExampleSelective(bankInfo, example);
            responseHeader = new ResponseHeader(true, "success", "更新成功");
        } catch (Exception e) {
            LOG.error("更新失败");
            responseHeader = new ResponseHeader(false, "fail", "更新失败");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }

    @Override
    public QueryBankInfoResponse queryBankInfo(QueryBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException {
        UcBankInfoCriteria example = new UcBankInfoCriteria();
        UcBankInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(bankInfoRequest.getTenantId());
        criteria.andUserIdEqualTo(bankInfoRequest.getUserId());
        Integer pageNo = bankInfoRequest.getPageNo();
        Integer pageSize = bankInfoRequest.getPageSize();
        List<UcBankInfo> list = new ArrayList<UcBankInfo>();
        int count = 0;
        QueryBankInfoResponse response = new QueryBankInfoResponse();
        ResponseHeader responseHeader;
        try {
            count = ucBankInfoAtomSV.countByExample(example);
            list = ucBankInfoAtomSV.selectByExample(example);
            responseHeader = new ResponseHeader(true, "success", "查询成功");
        } catch (Exception e) {
            LOG.error("查询失败", e);
            responseHeader = new ResponseHeader(false, "fail", "查询失败");
        }
        PageInfo<UcBankInfoParams> pageInfo = new PageInfo<UcBankInfoParams>();
        List<UcBankInfoParams> responseList = new ArrayList<UcBankInfoParams>();
        for (UcBankInfo ucBankInfo : list) {
            UcBankInfoParams ucBankInfoParams = new UcBankInfoParams();
            BeanUtils.copyProperties(ucBankInfo, ucBankInfoParams);
            responseList.add(ucBankInfoParams);
        }
        pageInfo.setCount(count);
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
        pageInfo.setResult(responseList);
        response.setPageInfo(pageInfo);
        response.setResponseHeader(responseHeader);
        return response;
    }

}
