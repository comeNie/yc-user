package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.bankinfo.param.InsertBankInfoRequest;
import com.ai.slp.user.api.bankinfo.param.QueryBankInfoRequest;
import com.ai.slp.user.api.bankinfo.param.QueryBankInfoResponse;
import com.ai.slp.user.api.bankinfo.param.UpdateBankInfoRequest;

public interface IUcBankInfoBusiSV {

    BaseResponse insertBankInfo(InsertBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException;

    BaseResponse UpdateBankInfo(UpdateBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException;

    QueryBankInfoResponse queryBankInfo(QueryBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException;
}
