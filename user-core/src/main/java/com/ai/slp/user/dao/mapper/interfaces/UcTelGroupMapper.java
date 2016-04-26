package com.ai.slp.user.dao.mapper.interfaces;

import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupParamsRequest;
import com.ai.slp.user.dao.mapper.bo.UcTelGroup;
import com.ai.slp.user.dao.mapper.bo.UcTelGroupCriteria;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UcTelGroupMapper {
    int countByExample(UcTelGroupCriteria example);

    int deleteByExample(UcTelGroupCriteria example);

    int insert(UcTelGroupParamsRequest contactsGroup);

    int insertSelective(UcTelGroup record);

    List<Map<String,Object>> selectByExample(UcTelGroupCriteria example);

    int updateByExampleSelective(@Param("record") UcTelGroup record, @Param("example") UcTelGroupCriteria example);

    int updateByExample(@Param("record") UcTelGroup record, @Param("example") UcTelGroupCriteria example);
}