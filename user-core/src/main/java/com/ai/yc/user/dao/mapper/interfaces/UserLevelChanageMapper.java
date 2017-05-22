package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UserLevelChanage;
import com.ai.yc.user.dao.mapper.bo.UserLevelChanageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLevelChanageMapper {
    int countByExample(UserLevelChanageCriteria example);

    int deleteByExample(UserLevelChanageCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(UserLevelChanage record);

    int insertSelective(UserLevelChanage record);

    List<UserLevelChanage> selectByExample(UserLevelChanageCriteria example);

    UserLevelChanage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserLevelChanage record, @Param("example") UserLevelChanageCriteria example);

    int updateByExample(@Param("record") UserLevelChanage record, @Param("example") UserLevelChanageCriteria example);

    int updateByPrimaryKeySelective(UserLevelChanage record);

    int updateByPrimaryKey(UserLevelChanage record);
}