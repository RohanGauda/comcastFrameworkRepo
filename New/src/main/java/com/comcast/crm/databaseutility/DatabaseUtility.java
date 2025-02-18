package com.comcast.crm.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.comcast.crm.fileutility.FileUtility;
import com.mysql.jdbc.Driver;

public class DatabaseUtility {
		
		Connection conn = null;
		Statement state = null;
		
		
		public void getConnection(String dburl,String username, String password) throws SQLException {
			try {
				FileUtility fu = new FileUtility();
				String url = fu.getFileUtility(dburl);
				String un = fu.getFileUtility(username);
				String pwd = fu.getFileUtility(password);
				Driver driver = new Driver();
				DriverManager.registerDriver(driver);
				conn = DriverManager.getConnection(url, un, pwd);
				state = conn.createStatement();
			}
			catch (Exception e) {
			}
		}
		
		public ResultSet getExecuteQuery(String query) {
			ResultSet result = null;
			try {
				result = state.executeQuery(query);
			}
			catch (Exception e) {
			}
			
			return result;
		}
		
		public int getExecuteUpdate(String query) {
			int data = 0;
			try {
				data = state.executeUpdate(query);
			}
			catch (Exception e) {
			}
			return data;
		}
		
		public void closeConnection() {
			try {
				conn.close();
			}
			catch (Exception e) {
			}
		}
}
