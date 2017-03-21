package com.ai.yc.user.dao.mapper.attach;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.ai.yc.user.api.usercompany.param.UserCompanyPageInfo;

public interface UsrCompanyAttachMapper {
	@Results({
		  @Result(property = "adminUserId", column = "admin_user_id", javaType = String.class),
	      @Result(property = "usersource", column = "usersource", javaType = String.class),
	      @Result(property="companyName",column="company_name",javaType=String.class,jdbcType= JdbcType.VARBINARY),
          @Result(property ="nickName",column = "nick_name",javaType=String.class,jdbcType= JdbcType.VARBINARY),
          @Result(property ="telephone",column = "telephone",javaType = String.class,jdbcType = JdbcType.VARCHAR),
          @Result(property ="linkman",column = "linkman",javaType = String.class,jdbcType = JdbcType.VARCHAR),
          @Result(property ="createTime",column = "create_time",javaType = Timestamp.class),
          @Result(property ="state",column = "state",javaType = Integer.class),
	})
	@Select("select usr.usersource,company.company_name,usr.nickname,usr.firstname,company.telephone,company.linkman,company.create_time,company.state from usr_user usr,usr_company company where usr.user_id = company.admin_user_id and #{condition} ")
	public List<UserCompanyPageInfo> getCompanyInfoList(String condition);
	
	@Result(property = "companyCount", column = "companyCount", javaType = Integer.class)
	@Select("select count(company.state) companyCount from usr_user usr,usr_company company where usr.user_id = company.admin_user_id and #{condition}")
	public int getCompanyInfoCount(String condition);
}
