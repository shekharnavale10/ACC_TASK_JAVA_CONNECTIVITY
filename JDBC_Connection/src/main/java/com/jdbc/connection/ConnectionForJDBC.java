package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionForJDBC {

	private static Connection conn = null;

	public static Connection getConnection() throws Exception {
		if (conn == null) {
			String url = "jdbc:mysql://localhost:3306/";
			String dbName = "shekhar";
			String driver = "com.mysql.jdbc.Driver";
			String userName = "root";
			String password = "";

			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url + dbName, userName, password);
		}

		return conn;
	}

}
