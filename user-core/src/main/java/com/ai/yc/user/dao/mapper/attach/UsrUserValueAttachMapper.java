package com.ai.yc.user.dao.mapper.attach;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;


public interface UsrUserValueAttachMapper {
	@Results({
		@Result(property ="userId",column = "user_id",javaType=String.class,jdbcType= JdbcType.VARBINARY),
	})
	@Select("SELECT c.user_id FROM usr_company_relation a INNER JOIN usr_company b ON a.company_id = b.company_id INNER JOIN usr_user c ON a.user_id = c.user_id WHERE b.state=1 AND a.status=0;")
	public List<String> getCompanyUserId();

}
