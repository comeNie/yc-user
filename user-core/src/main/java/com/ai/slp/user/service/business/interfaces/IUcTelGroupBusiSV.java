package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupParamsRequest;
import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupResponse;

public interface IUcTelGroupBusiSV {
    
    public BaseResponse insertUcTelGroupInfo(UcTelGroupParamsRequest contactsGroup)throws BusinessException, SystemException;
    
    public BaseResponse deleteGroupInfo(String telGroupId)throws BusinessException, SystemException;
    
    public UcTelGroupResponse selectGroupInfo(int startPage,int limit)throws BusinessException, SystemException;
    
    public BaseResponse updateUcTelGroupInfo(UcTelGroupParamsRequest contactsGroup)throws BusinessException, SystemException;
    
    public int getUcTelGroupCount(UcTelGroupParamsRequest contactsGroup)throws BusinessException, SystemException;
}
