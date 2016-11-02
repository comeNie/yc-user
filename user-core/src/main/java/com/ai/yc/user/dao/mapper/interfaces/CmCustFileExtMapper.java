package com.ai.yc.user.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ai.yc.user.dao.mapper.bo.CmCustFileExt;
import com.ai.yc.user.dao.mapper.bo.CmCustFileExtCriteria;

public interface CmCustFileExtMapper {
    int countByExample(CmCustFileExtCriteria example);

    int deleteByExample(CmCustFileExtCriteria example);

    int deleteByPrimaryKey(String infoExtId);

    int insert(CmCustFileExt record);

    int insertSelective(CmCustFileExt record);

    List<CmCustFileExt> selectByExample(CmCustFileExtCriteria example);

    CmCustFileExt selectByPrimaryKey(String infoExtId);

    int updateByExampleSelective(@Param("record") CmCustFileExt record, @Param("example") CmCustFileExtCriteria example);

    int updateByExample(@Param("record") CmCustFileExt record, @Param("example") CmCustFileExtCriteria example);

    int updateByPrimaryKeySelective(CmCustFileExt record);

    int updateByPrimaryKey(CmCustFileExt record);
}