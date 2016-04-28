package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.slp.user.dao.mapper.bo.UcContactsInfo;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.slp.user.dao.mapper.bo.UcStateChg;
import com.ai.slp.user.dao.mapper.bo.UcStateChgCriteria;
import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserAgree;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IRegisterAtomSV;

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
    
}
