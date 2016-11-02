package com.ai.yc.user.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.user.dao.mapper.bo.UcLoginLog;
import com.ai.yc.user.dao.mapper.bo.UcLoginLogCriteria;
import com.ai.yc.user.dao.mapper.interfaces.UcLoginLogMapper;
import com.ai.yc.user.service.atom.interfaces.IUcLoginLogAtomSV;


@Component
public class UcLoginLogAtomSVImpl implements IUcLoginLogAtomSV {
    @Autowired
    private transient UcLoginLogMapper loginLogMapper;
    
    @Override
    public void insertUcLoginLogInfo(UcLoginLog ucLoginLog) {
        loginLogMapper.insert(ucLoginLog);
    }


}
