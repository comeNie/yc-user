package com.ai.yc.user.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.springframework.jdbc.support.JdbcUtils;

import com.ai.yc.user.util.DataSourceUtil;
import com.alibaba.fastjson.JSON;

public class DataSourceTest {

	
	@Test
	public void testRegister() {
		try {
			System.out.println("数据库连接："+JSON.toJSONString(DataSourceUtil.getConnection()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testQueryUser(){
		    Long userid=4L;
			
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			try {
				conn = DataSourceUtil.getConnection();
				String sql ="";			
				sql="select PK_USER, USERNAME, EMAIL, STATE, PASSWORD, LASTNAME, FIRSTNAME, PHOTOPATH, SEX, BIRTHDAY, SHOW_NAME, YEARS_WORK, NATIVE_LANG, TELEPHONE, MOBILE_PHONE, ADDRESS, CITY, CN_CITY, PROVINCE, COUNTRY, TIME_ZONE, IS_PUBLIC_INFO, IS_RECEIVE_COMM, IS_RANSLATOR, IS_LSP, LSP_ID, INTRODUCTION, REGIST_TIME, LAST_MODIFY_TIME, QQ, IS_USED_ALONE, PK_TEAM, OCCUPATION, TITLE, NUMBER_OF_PUBLISHED_TRANSLATIONS, NATURE_OF_OCCUPATION, USERSOURCE, THIRDUID, NICKNAME, IS_MANAGE, COUNTRY_VALUE, COUNTRY_CODE, signature, SYSTEMSOURCE from t_user where PK_USER=?";
				ps = conn.prepareStatement(sql);
				ps.setLong(1, userid);
				rs = ps.executeQuery();
				if (rs.next()) {
					
					String USERNAME=rs.getString("USERNAME");	
					String LASTNAME=rs.getString("LASTNAME");	
					String FIRSTNAME=rs.getString("FIRSTNAME");	
					
					System.out.println("userid="+userid);							
					System.out.println("USERNAME="+USERNAME);							
					System.out.println("LASTNAME="+LASTNAME);							
					System.out.println("FIRSTNAME="+FIRSTNAME);							
					
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage(), e);
			} finally {
				DataSourceUtil.free(rs, ps, conn);
			}		
			
			
		}
	
	
}
