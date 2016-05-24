package com.ai.slp.user.service.atom.interfaces;

import java.util.List;

import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.dao.mapper.bo.UcCustKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcCustKeyInfoCriteria;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;

public interface IUcUserAtomSV {
    
    List<UcUser> searchUcUserInfo(UcUserCriteria example) ;
    
    List<UcCustKeyInfo> searchUcCustKeyInfo(UcCustKeyInfoCriteria example);
    
    List<UcGroupKeyInfo> searchUcGroupKeyInfo(UcGroupKeyInfoCriteria example);
    
    int countByExample(UcUserCriteria example);
    
    UcUser queryByPhone(String phone)throws SystemException;
    
    UcUser queryByEmail(String email)throws SystemException;
    
    UcUser queryByUserId(String userId) throws SystemException;
    
    int updateByAccountId(UcUser gnAccount,UcUserCriteria example) throws SystemException;
}
