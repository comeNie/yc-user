package com.ai.yc.user.dao.mapper.attach;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.ai.yc.user.api.usercompany.param.UserCompanyInfoResponse;
import com.ai.yc.user.dao.mapper.bo.UsrUser;

public interface UsrUserValueAttachMapper {
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
	@Select("select c.company_id,c.company_name,c.license_attacid,c.admin_user_id,c.account_id,c.entp_attacid,c.license_attacid,c.linkman,c.telephone,c.members_count,c.auditor,c.check_time,c.state,r.is_management from usr_company c,usr_company_relation r where c.company_id = r.company_id and c.state = 1 and r.user_id=#{userId}")
	public List<UsrUser> getCompanyInfoByUserId(@Param("userId") String userId);
	@Select("SELECT c.user_id,c.nickname,c.lastname,c.firstname,c.sex,c.birthday,c.telephone,c.mobile_phone,c.fix_phone,c.address,c.cn_city,c.province,c.safety_level,c.regist_time,c.last_modify_time,c.usersource,c.state,c.portrait_id,c.is_translator,c.account_id,c.griwth_level,c.griwth_value"
			+ " FROM usr_company_relation a INNER JOIN usr_company b ON a.company_id = b.company_id INNER JOIN usr_user c ON a.user_id = c.user_id WHERE b.state=1 AND a.status=0;")

	public List<UsrUser> getUserInfoByParam(@Param("userId") String userId);

}
