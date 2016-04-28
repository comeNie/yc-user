package com.ai.slp.user.api.specialinfo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.specialinfo.interfaces.IUcSpecialInfoSV;
import com.ai.slp.user.api.specialinfo.param.InsertSpecialInfoRequest;
import com.ai.slp.user.api.specialinfo.param.InsertSpecialInfoResponse;
import com.ai.slp.user.api.specialinfo.param.QuerySpecialInfoRequest;
import com.ai.slp.user.api.specialinfo.param.QuerySpecialInfoResponse;
import com.ai.slp.user.api.specialinfo.param.UpdateSepcialInfoRequest;
import com.ai.slp.user.service.business.interfaces.IUcSpecialInfoBusiSV;

@Service
@Transactional
public class UcSpecialInfoSVImpl implements IUcSpecialInfoSV {

    @Autowired
    private IUcSpecialInfoBusiSV ucSpecialInfoBusiSV;

    @Override
    public InsertSpecialInfoResponse insertSpecialInfo(InsertSpecialInfoRequest specialInfoRequest)
            throws BusinessException, SystemException {
        return ucSpecialInfoBusiSV.insertSpecialInfo(specialInfoRequest);
    }

    @Override
    public void updateSpecialInfo(UpdateSepcialInfoRequest specialInfoRequest)
            throws BusinessException, SystemException {
        ucSpecialInfoBusiSV.updateSpecialInfo(specialInfoRequest);
    }

    @Override
    public QuerySpecialInfoResponse querySpecialInfo(QuerySpecialInfoRequest specialInfoRequest)
            throws BusinessException, SystemException {
        return ucSpecialInfoBusiSV.querySpecialInfo(specialInfoRequest);
    }

}
