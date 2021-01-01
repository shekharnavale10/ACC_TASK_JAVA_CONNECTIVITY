package com.application;

import java.sql.Connection;
import java.sql.SQLException;

import com.jdbc.connection.ConnectionForJDBC;

public class Application {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;

		try {
			conn = ConnectionForJDBC.getConnection();
			if (conn != null) {
				System.out.println("************we got connected to database shekhar ************");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			conn.close();
		}

	}

}
