package com.ai.slp.user.api.bankinfo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.bankinfo.interfaces.IUcBankInfoSV;
import com.ai.slp.user.api.bankinfo.param.InsertBankInfoRequest;
import com.ai.slp.user.api.bankinfo.param.QueryBankInfoRequest;
import com.ai.slp.user.api.bankinfo.param.QueryBankInfoResponse;
import com.ai.slp.user.api.bankinfo.param.UpdateBankInfoRequest;
import com.ai.slp.user.service.business.interfaces.IUcBankInfoBusiSV;

@Service
@Transactional
public class UcBankInfoSVImpl implements IUcBankInfoSV {

    @Autowired
    private IUcBankInfoBusiSV ucBankInfoBusiSV;

    @Override
    public BaseResponse insertBankInfo(InsertBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException {
        return ucBankInfoBusiSV.insertBankInfo(bankInfoRequest);
    }

    @Override
    public QueryBankInfoResponse queryBankInfo(QueryBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException {
        return ucBankInfoBusiSV.queryBankInfo(bankInfoRequest);
    }

    @Override
    public BaseResponse updateBankInfo(UpdateBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException {
        return ucBankInfoBusiSV.UpdateBankInfo(bankInfoRequest);
    }

}
