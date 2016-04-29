package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.dao.mapper.bo.UcCustKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcCustKeyInfoCriteria;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUcUserAtomSV;

@Component
public class UcUserAtomSVImpl implements IUcUserAtomSV {

    @Override
    public List<UcUser> searchUcUserInfo(UcUserCriteria example) throws SystemException {
        return MapperFactory.getUcUserMapper().selectByExample(example);
    }
    
    @Override
    public List<UcCustKeyInfo> searchUcCustKeyInfo(UcCustKeyInfoCriteria example) throws SystemException {
        return MapperFactory.getUcCustKeyInfoMapper().selectByExample(example);
    }
    
    
    @Override
    public List<UcGroupKeyInfo> searchUcGroupKeyInfo(UcGroupKeyInfoCriteria example) throws SystemException {
        return MapperFactory.getUcGroupKeyInfoMapper().selectByExample(example);
    }

    @Override
    public int countByExample(UcUserCriteria example) {
        return MapperFactory.getUcUserMapper().countByExample(example);
    }
}
