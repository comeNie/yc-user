package com.ai.yc.user.dao.mapper.attach;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.ai.yc.user.api.usercompany.param.UserCompanyPageInfo;
import com.ai.yc.user.api.usercompany.param.UserCompanyPageInfoRequest;

public interface UsrCompanyAttachMapper {
	@SelectProvider(type = UsrCompanyQueryList.class, method = "queryUserCompany")
	@Results({
		  @Result(property = "companyId", column = "company_id", javaType = String.class),
		  @Result(property = "membersCount", column = "members_count", javaType =Integer.class),
		  @Result(property = "adminUserId", column = "admin_user_id", javaType = String.class),
	      @Result(property = "usersource", column = "usr.usersource", javaType = String.class),
	      @Result(property = "lastname", column = "usr.lastname", javaType = String.class),
	      @Result(property = "firstname", column = "usr.firstname", javaType = String.class),
	      @Result(property="companyName",column="company_name",javaType=String.class,jdbcType= JdbcType.VARBINARY),
          @Result(property ="nickName",column = "nick_name",javaType=String.class,jdbcType= JdbcType.VARBINARY),
          @Result(property ="telephone",column = "telephone",javaType = String.class,jdbcType = JdbcType.VARCHAR),
          @Result(property ="linkman",column = "linkman",javaType = String.class,jdbcType = JdbcType.VARCHAR),
          @Result(property ="createTime",column = "create_time",javaType = Timestamp.class),
          @Result(property ="checkTime",column = "check_time",javaType = Timestamp.class),
          @Result(property ="state",column = "state",javaType = Integer.class),
	})
	public List<UserCompanyPageInfo> getCompanyInfoList(UserCompanyPageInfoRequest request);
	
	@SelectProvider(type=UsrCompanyQueryList.class,method="queryUserCompanyCount")
	public int getCompanyInfoCount(UserCompanyPageInfoRequest request);
}
