package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UsrExtend;
import com.ai.yc.user.dao.mapper.bo.UsrExtendCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrExtendMapper {
    int countByExample(UsrExtendCriteria example);

    int deleteByExample(UsrExtendCriteria example);

    int insert(UsrExtend record);

    int insertSelective(UsrExtend record);

    List<UsrExtend> selectByExample(UsrExtendCriteria example);

    int updateByExampleSelective(@Param("record") UsrExtend record, @Param("example") UsrExtendCriteria example);

    int updateByExample(@Param("record") UsrExtend record, @Param("example") UsrExtendCriteria example);
}