package com.ai.yc.user.dao.mapper.attach;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

public interface UsrGriwthValueAttachMapper {
	
	
    @Result(property = "sumValue", column = "sumValue", javaType = Integer.class)
	@Select("select sum(griwth_value) as sumValue from usr_griwth_value where user_id = #{userId}")
	int getGriwthValueSum(@Param("userId") String userId);
}
