package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupParamsRequest;
import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupResponse;

public interface IUcTelGroupBusiSV {
    
    public BaseResponse insertUcTelGroupInfo(UcTelGroupParamsRequest contactsGroup);
    
    public BaseResponse deleteGroupInfo(String telGroupId);
    
    public UcTelGroupResponse selectGroupInfo(int startPage,int limit);
    
    public BaseResponse updateUcTelGroupInfo(UcTelGroupParamsRequest contactsGroup);
    
    public int getUcTelGroupCount(UcTelGroupParamsRequest contactsGroup);
}
