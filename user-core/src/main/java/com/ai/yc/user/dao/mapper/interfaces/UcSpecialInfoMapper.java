package com.ai.yc.user.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ai.yc.user.dao.mapper.bo.UcSpecialInfo;
import com.ai.yc.user.dao.mapper.bo.UcSpecialInfoCriteria;

public interface UcSpecialInfoMapper {
    int countByExample(UcSpecialInfoCriteria example);

    int deleteByExample(UcSpecialInfoCriteria example);

    int insert(UcSpecialInfo record);

    int insertSelective(UcSpecialInfo record);

    List<UcSpecialInfo> selectByExample(UcSpecialInfoCriteria example);

    int updateByExampleSelective(@Param("record") UcSpecialInfo record, @Param("example") UcSpecialInfoCriteria example);

    int updateByExample(@Param("record") UcSpecialInfo record, @Param("example") UcSpecialInfoCriteria example);
}