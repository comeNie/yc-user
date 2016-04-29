package com.ai.slp.user.api.specialinfo.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.specialinfo.param.InsertSpecialInfoRequest;
import com.ai.slp.user.api.specialinfo.param.QuerySpecialInfoRequest;
import com.ai.slp.user.api.specialinfo.param.QuerySpecialInfoResponse;
import com.ai.slp.user.api.specialinfo.param.UpdateSepcialInfoRequest;

/**
 * 用户个性化信息服务 Date: 2016年4月28日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public interface IUcSpecialInfoSV {

    @interface InsertSpecialInfo {
    }

    /**
     * 创建用户个性化信息
     * 
     * @param specialInfoRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse insertSpecialInfo(InsertSpecialInfoRequest specialInfoRequest)
            throws BusinessException, SystemException;

    @interface UpdateSpecialInfo {
    }

    /**
     * 更新用户个性化信息
     * 
     * @param spInfoRequest
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse updateSpecialInfo(UpdateSepcialInfoRequest specialInfoRequest)
            throws BusinessException, SystemException;

    @interface QuerySpecialInfo {
    }

    /**
     * 获取用户个性化信息
     * 
     * @param specialInfoRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    QuerySpecialInfoResponse querySpecialInfo(QuerySpecialInfoRequest specialInfoRequest)
            throws BusinessException, SystemException;
}
