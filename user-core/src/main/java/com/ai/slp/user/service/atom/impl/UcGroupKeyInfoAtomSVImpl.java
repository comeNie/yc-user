package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.slp.user.dao.mapper.interfaces.UcGroupKeyInfoMapper;
import com.ai.slp.user.service.atom.interfaces.IUcGroupKeyInfoAtomSV;

@Component
public class UcGroupKeyInfoAtomSVImpl implements IUcGroupKeyInfoAtomSV {

    @Autowired
    private UcGroupKeyInfoMapper ucGroupKeyInfoMapper;
    
    @Override
    public int insert(UcGroupKeyInfo record) {
        return ucGroupKeyInfoMapper.insert(record);
    }

    @Override
    public List<UcGroupKeyInfo> selectByExample(UcGroupKeyInfoCriteria example) {
        return ucGroupKeyInfoMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UcGroupKeyInfo record, UcGroupKeyInfoCriteria example) {
        return ucGroupKeyInfoMapper.updateByExampleSelective(record, example);
    }

}
