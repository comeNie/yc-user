package com.ai.slp.user.service.atom.interfaces;

import java.util.List;
import java.util.Map;

import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupParamsRequest;
import com.ai.slp.user.dao.mapper.bo.UcTelGroup;
import com.ai.slp.user.dao.mapper.bo.UcTelGroupCriteria;

public interface IUcTelGroupAtomSV {
    
    public void insertUcTelGroupInfo(UcTelGroupParamsRequest contactsGroup);
    
    public List<Map<String,Object>> selectUcTelGroupInfo(UcTelGroupCriteria ucTelGroupCriteria);
    
    public void updateUcTelGroupInfo(UcTelGroup contactsGroup,UcTelGroupCriteria example);
    
    public int countUcTelGroupInfo(UcTelGroupCriteria example);
    
    public void deleteUcTelGroupInfo(UcTelGroupCriteria example);
    
}
