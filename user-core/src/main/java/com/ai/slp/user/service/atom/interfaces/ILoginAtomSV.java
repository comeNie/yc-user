package com.ai.slp.user.service.atom.interfaces;

import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;

public interface ILoginAtomSV {
    
    int countByExample(UcUserCriteria example) throws SystemException;
}
