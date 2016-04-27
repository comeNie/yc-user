package com.ai.slp.user.api.ucStateChg.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucStateChg.interfaces.IUcStateChgSV;
import com.ai.slp.user.api.ucStateChg.param.UcStateChgParamsRequest;
import com.ai.slp.user.service.business.interfaces.IUcStateChgBusiSV;

@Service
public class UcStateChgSVImpl implements IUcStateChgSV{

    @Autowired
    IUcStateChgBusiSV ucStateChgBusiSv;
   
    @Override
    public BaseResponse insertUcStateChgInfo(UcStateChgParamsRequest ucStateChgParam) {
       
        return ucStateChgBusiSv.insertUcStateChgBusiInfo(ucStateChgParam);
    }

    @Override
    public BaseResponse updateUcStateChgInfo(UcStateChgParamsRequest ucStateChgParam) {
        return ucStateChgBusiSv.updateUcStateChgBusiInfo(ucStateChgParam);
    }

}
