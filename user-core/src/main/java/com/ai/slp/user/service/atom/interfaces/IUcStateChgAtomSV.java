package com.ai.slp.user.service.atom.interfaces;

import org.apache.ibatis.annotations.Param;

import com.ai.slp.user.dao.mapper.bo.UcStateChg;
import com.ai.slp.user.dao.mapper.bo.UcStateChgCriteria;

public interface IUcStateChgAtomSV {
   
    public int insertUcStateChgBusiInfo(UcStateChg ucStateChgParam);
   
    public int updateUcStateChgBusiInfo(@Param("record")
    UcStateChg record, @Param("example")
    UcStateChgCriteria example);
}
