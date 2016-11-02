package com.ai.yc.user.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ai.yc.user.dao.mapper.bo.UcUser;
import com.ai.yc.user.dao.mapper.bo.UcUserCriteria;

public interface UcUserMapper {
    int countByExample(UcUserCriteria example);

    int deleteByExample(UcUserCriteria example);

    int insert(UcUser record);

    int insertSelective(UcUser record);

    List<UcUser> selectByExample(UcUserCriteria example);

    int updateByExampleSelective(@Param("record") UcUser record, @Param("example") UcUserCriteria example);

    int updateByExample(@Param("record") UcUser record, @Param("example") UcUserCriteria example);
}