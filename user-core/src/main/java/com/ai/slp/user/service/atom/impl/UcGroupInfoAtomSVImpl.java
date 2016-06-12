package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.slp.user.dao.mapper.interfaces.UcGroupKeyInfoMapper;
import com.ai.slp.user.service.atom.interfaces.IUcGroupKeyInfoAtomSV;

@Service
public class UcGroupInfoAtomSVImpl implements IUcGroupKeyInfoAtomSV {

    @Autowired
    private transient UcGroupKeyInfoMapper mapper;
    
    @Override
    public int insert(UcGroupKeyInfo record) {
        return mapper.insert(record);
    }

    @Override
    public List<UcGroupKeyInfo> selectByExample(UcGroupKeyInfoCriteria example) {
        return mapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UcGroupKeyInfo record, UcGroupKeyInfoCriteria example) {
        return mapper.updateByExampleSelective(record, example);
    }

}
