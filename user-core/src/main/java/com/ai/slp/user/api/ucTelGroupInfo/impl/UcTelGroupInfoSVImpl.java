package com.ai.slp.user.api.ucTelGroupInfo.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucTelGroupInfo.interfaces.IUcTelGroupSV;
import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupParamsRequest;
import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupResponse;
import com.ai.slp.user.service.business.interfaces.IUcTelGroupBusiSV;

@Service
public class UcTelGroupInfoSVImpl implements IUcTelGroupSV{

    @Autowired
    private IUcTelGroupBusiSV ucTelGroupBusiSv;
    
    @Override
    public BaseResponse insertUcTelGroupInfo(UcTelGroupParamsRequest contactsGroup) throws BusinessException, SystemException {

        return ucTelGroupBusiSv.insertUcTelGroupInfo(contactsGroup);
    }

    @Override
    public BaseResponse updateGroupInfo(UcTelGroupParamsRequest contactsGroup) throws BusinessException, SystemException{
        return ucTelGroupBusiSv.updateUcTelGroupInfo(contactsGroup);
    }

    @Override
    public BaseResponse deleteGroupInfo(String telGroupId) throws BusinessException, SystemException {
        return ucTelGroupBusiSv.deleteGroupInfo(telGroupId);
    }

    @Override
    public UcTelGroupResponse getTelGroupInfo(int startPage,int limit) throws BusinessException, SystemException {
        return ucTelGroupBusiSv.selectGroupInfo(startPage, limit);
    }

    @Override
    public int getTelGroupCount(UcTelGroupParamsRequest telGroup) throws BusinessException, SystemException {
        return ucTelGroupBusiSv.getUcTelGroupCount(telGroup);
    }

}
