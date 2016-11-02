package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.yc.user.dao.mapper.bo.CmCustFileExt;
import com.ai.yc.user.dao.mapper.bo.CmCustFileExtCriteria;


public interface ICustFileAtomSV {

    int insert(CmCustFileExt record);

    int updateByExampleSelective(@Param("record") CmCustFileExt record, @Param("example") CmCustFileExtCriteria example);
    
    List<CmCustFileExt> selectByExample(CmCustFileExtCriteria example);
    
}
