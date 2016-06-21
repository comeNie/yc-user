package com.ai.slp.user.service.atom.interfaces;

import java.util.List;

import com.ai.slp.user.dao.mapper.bo.CmCustFileExt;
import com.ai.slp.user.dao.mapper.bo.CmCustFileExtCriteria;

public interface ICustFileAtomSV {

    int insert(CmCustFileExt record);

    int updateByPrimaryKeySelective(CmCustFileExt record);
    
    List<CmCustFileExt> selectByExample(CmCustFileExtCriteria example);
}
