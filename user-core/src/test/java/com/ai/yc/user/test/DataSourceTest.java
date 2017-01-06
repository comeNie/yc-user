package com.ai.yc.user.test;

import java.sql.SQLException;

import org.junit.Test;

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
	
	
}
