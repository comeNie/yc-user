package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import com.ai.opt.base.exception.SystemException;
import com.ai.yc.user.dao.mapper.bo.UcUser;
import com.ai.yc.user.dao.mapper.bo.UcUserCriteria;

public interface ILoginAtomSV {
    
    int countByExample(UcUserCriteria example) throws SystemException;
    
    List<UcUser> selectByExample(UcUserCriteria example);
}
