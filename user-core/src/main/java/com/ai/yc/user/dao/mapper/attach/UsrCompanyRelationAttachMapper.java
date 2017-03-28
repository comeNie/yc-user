package com.ai.yc.user.dao.mapper.attach;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import com.ai.yc.user.api.usercompany.param.UserCompanyRelationPageInfo;

public interface UsrCompanyRelationAttachMapper {
	@Results({
		  @Result(property ="userId",column = "user_id",javaType=String.class,jdbcType= JdbcType.VARBINARY),
          @Result(property ="nickName",column = "nickname",javaType=String.class,jdbcType= JdbcType.VARBINARY),
          @Result(property ="isManagment",column = "is_management",javaType =Integer.class),
          @Result(property ="joinTime",column = "join_time",javaType = Timestamp.class),
          @Result(property ="state",column = "state",javaType = Integer.class),
	})
	@Select("select usr.user_id,usr.nickname,company.is_management,company.join_time from usr_user usr,usr_company_relation company where usr.user_id = company.user_id and company.company_id = #{companyId} limit #{limitStart},#{limitEnd}")
	public List<UserCompanyRelationPageInfo> getCompanyInfoList(@Param("companyId") String companyId,@Param("limitStart") int limitStart,@Param("limitEnd") int limitEnd);
	
	@Select("select count(company.company_id) count from usr_user usr,usr_company_relation company where usr.user_id = company.user_id and company.company_id = #{companyId}")
	public int getCompanyInfoCount(@Param("companyId") String companyId);
	
}
