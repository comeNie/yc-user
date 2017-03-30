package com.ai.yc.user.dao.mapper.attach;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.ai.yc.user.api.usercompany.param.UserCompanyInfoResponse;
import com.ai.yc.user.api.usercompany.param.UserCompanyPageInfo;
import com.ai.yc.user.api.usercompany.param.UserCompanyPageInfoRequest;
import com.ai.yc.user.dao.mapper.bo.UsrCompany;

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
	
	@Results({
		@Result(property ="companyId",column = "company_id",javaType=String.class,jdbcType= JdbcType.VARBINARY),
        @Result(property ="companyName",column = "company_name",javaType=String.class,jdbcType= JdbcType.VARBINARY),
        @Result(property ="licenseAttacid",column = "license_attacid",javaType =String.class),
        @Result(property ="adminUserId",column = "admin_user_id",javaType=String.class,jdbcType= JdbcType.VARBINARY),
        @Result(property ="accountId",column = "account_id",javaType=Long.class,jdbcType= JdbcType.VARBINARY),
        @Result(property ="entpAttacid",column = "entp_attacid",javaType=String.class,jdbcType= JdbcType.VARBINARY),
        @Result(property ="licenseAttacid",column = "license_attacid",javaType=String.class,jdbcType= JdbcType.VARBINARY),
        @Result(property ="linkman",column = "linkman",javaType=String.class,jdbcType= JdbcType.VARBINARY),
        @Result(property ="telephone",column = "telephone",javaType=String.class,jdbcType= JdbcType.VARBINARY),
        @Result(property ="membersCount",column = "members_count",javaType=Long.class,jdbcType= JdbcType.VARBINARY),
        @Result(property ="auditor",column = "auditor",javaType=String.class,jdbcType= JdbcType.VARBINARY),
        @Result(property ="checkTime",column = "check_time",javaType = Timestamp.class),
        @Result(property ="state",column = "state",javaType = Integer.class),
        @Result(property ="isManagement",column = "is_management",javaType = Integer.class),
        
	})
	@Select("select c.company_id,c.company_name,c.license_attacid,c.admin_user_id,c.account_id,c.entp_attacid,c.license_attacid,c.linkman,c.telephone,c.members_count,c.auditor,c.check_time,c.state,r.is_management from usr_company c,usr_company_relation r where c.company_id and r.company_id and c.state = 1 and r.user_id=#{userId}")
	public UserCompanyInfoResponse getCompanyInfoByUserId(@Param("userId") String userId);
}
