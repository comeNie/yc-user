package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcBankInfo;
import com.ai.slp.user.dao.mapper.bo.UcContactsInfo;
import com.ai.slp.user.dao.mapper.bo.UcContactsInfoCriteria;
import com.ai.slp.user.dao.mapper.bo.UcCustKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcCustKeyInfoCriteria;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.slp.user.dao.mapper.bo.UcStateChg;
import com.ai.slp.user.dao.mapper.bo.UcStateChgCriteria;
import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserAgree;
import com.ai.slp.user.dao.mapper.bo.UcUserAgreeCriteria;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IRegisterAtomSV;

@Component
public class RegisterAtomSVImpl implements IRegisterAtomSV {

    @Override
    public int insertUserInfo(UcUser user) {
        return MapperFactory.getUcUserMapper().insert(user);
    }

    @Override
    public List<UcUser> getUserInfo(UcUserCriteria criteria) {
        return MapperFactory.getUcUserMapper().selectByExample(criteria);
    }

    @Override
    public int insertUcGroupKeyInfo(UcGroupKeyInfo ucGroupKey) {
        return MapperFactory.getUcGroupKeyInfoMapper().insert(ucGroupKey);
    }

    @Override
    public List<UcGroupKeyInfo> getUcGroupKeyInfo(UcGroupKeyInfoCriteria criteria) {
        return MapperFactory.getUcGroupKeyInfoMapper().selectByExample(criteria);
    }
    
    

    @Override
    public int insertUcContactsInfo(UcContactsInfo ucContactsInfo) {
        
        return MapperFactory.getUcContactsInfoMapper().insert(ucContactsInfo);
    }

    @Override
    public void InsertUcUserAgreeAtomSv(UcUserAgree record) {
         MapperFactory.getUcUserAgreeMapper().insert(record);
    }

    @Override
    public int updateUcStateChgBusiInfo(@Param("record")
    UcStateChg record, @Param("example")
    UcStateChgCriteria example) {
        return MapperFactory.getUcStateChgMapper().updateByExample(record, example);
    }

    @Override
    public int insertUcStateChgBusiInfo(UcStateChg ucStateChgParam) {
        return MapperFactory.getUcStateChgMapper().insert(ucStateChgParam);
    }

    @Override
    public int insertUcBankInfo(UcBankInfo ucBankInfo) {
        return MapperFactory.getUcBankInfoMapper().insert(ucBankInfo);
    }

    @Override
    public int insertUcCustKeyInfo(UcCustKeyInfo ucContactsInfo) {
        return MapperFactory.getUcCustKeyInfoMapper().insert(ucContactsInfo);
    }

    @Override
    public int updateUserInfo(UcUser record, UcUserCriteria example) {
        return MapperFactory.getUcUserMapper().updateByExample(record, example);
    }

    @Override
    public int updateGroupKeyInfo(UcGroupKeyInfo record, UcGroupKeyInfoCriteria example) {
        return MapperFactory.getUcGroupKeyInfoMapper().updateByExampleSelective(record, example);
    }

    @Override
    public int updateUserAgree(UcUserAgree record, UcUserAgreeCriteria example) {
        return MapperFactory.getUcUserAgreeMapper().updateByExample(record, example);
    }

    @Override
    public int updateCustKeyInfo(UcCustKeyInfo record, UcCustKeyInfoCriteria example) {
        return MapperFactory.getUcCustKeyInfoMapper().updateByExample(record, example);
    }

    @Override
    public List<UcCustKeyInfo> getUcCustKeyInfo(UcCustKeyInfoCriteria criteria) {
        return MapperFactory.getUcCustKeyInfoMapper().selectByExample(criteria);
    }

    @Override
    public List<UcContactsInfo> getUcContactsInfo(UcContactsInfoCriteria criteria) {
        return MapperFactory.getUcContactsInfoMapper().selectByExample(criteria);
    }
    
}
