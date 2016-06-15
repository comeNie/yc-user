package com.ai.slp.user.service.atom.interfaces;

import com.ai.slp.user.dao.mapper.bo.CmCustFileExt;

public interface ICustFileAtomSV {

    int insert(CmCustFileExt record);

    int updateByPrimaryKeySelective(CmCustFileExt record);
}
