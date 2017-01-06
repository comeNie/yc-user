package com.ai.yc.user.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.datasource.OptHikariDataSource;

/**
 * 
 * 
 * 2017-01-03
 * 
 * @author <a href="mailto:guchuanlong@126.com">gucl</a>
 * 
 */
public final class DataSourceUtil {
	private static final String DS_NAME="old-yc-gtctech-db";
	private static DataSource myDataSource = null;
	private static Logger logger=LoggerFactory.getLogger(DataSourceUtil.class);

	private DataSourceUtil() {
	}

	static {
		try {
			myDataSource = new OptHikariDataSource(DS_NAME);
			logger.info("第一次使用["+DS_NAME+"]数据源，创建数据源成功！");
		} catch (Exception e) {
			logger.error("第一次使用["+DS_NAME+"]数据源，创建数据源失败！具体原因："+e.getMessage());
			throw new SystemException(e);
		}
	}

	public static DataSource getDataSource() {
		return myDataSource;
	}

	public static Connection getConnection() throws SQLException {
		Connection conn=myDataSource.getConnection();
		logger.info("从["+DS_NAME+"]数据源，获取连接【"+conn.toString()+"】");
		return conn;
	}
	
	public static void closeConnection(Connection conn) throws Exception{
		try {
			if (conn != null){
				String connName=conn.toString();
				conn.close();	
				logger.debug("DataSourceUtil.closeConnection关闭数据库连接【"+connName+"】");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 释放ResultSet, Statement, Connection
	 * @param rs
	 * @param st
	 * @param conn
	 */
	public static void free(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (conn != null)
					try {
						String connName=conn.toString();
						conn.close();
						logger.debug("DataSourceUtil关闭数据库连接【"+connName+"】");
					} catch (Exception e) {
						e.printStackTrace();
					}
			}
		}
	}
	/**
	 * 释放ResultSet, Statement
	 * @param rs
	 * @param st
	 */
	public static void free(ResultSet rs, Statement st) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
	}
}
