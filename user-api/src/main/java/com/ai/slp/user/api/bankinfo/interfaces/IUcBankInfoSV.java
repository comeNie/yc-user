package com.ai.slp.user.api.bankinfo.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.bankinfo.param.InsertBankInfoRequest;
import com.ai.slp.user.api.bankinfo.param.InsertBankInfoResponse;
import com.ai.slp.user.api.bankinfo.param.QueryBankInfoRequest;
import com.ai.slp.user.api.bankinfo.param.QueryBankInfoResponse;
import com.ai.slp.user.api.bankinfo.param.UpdateBankInfoRequest;

/**
 * 用户银行信息服务 Date: 2016年4月28日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public interface IUcBankInfoSV {

    @interface InsertBankInfo {
    }

    /**
     * 创建用户银行信息
     * 
     * @param bankInfoRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    InsertBankInfoResponse insertBankInfo(InsertBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException;

    @interface UpdateBankInfo {
    }

    /**
     * 更新用户银行信息
     * 
     * @param bankInfoRequest
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    void updateBankInfo(UpdateBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException;

    @interface QueryBankInfo{}
    /**
     * 查询用户银行信息
     * 
     * @param bankInfoRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    PageInfo<QueryBankInfoResponse> queryBankInfo(QueryBankInfoRequest bankInfoRequest)
            throws BusinessException, SystemException;
}
