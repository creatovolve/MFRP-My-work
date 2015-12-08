package com.cogaip.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtil {

	//creating object
	private static Connection conn;

	
	public static Connection openConnection() throws ClassNotFoundException,
	SQLException {

		ResourceBundle rb = ResourceBundle.getBundle("lib.mysql"); 

		String driver = rb.getString("driver");
		String url = rb.getString("url");
		String dbUser = rb.getString("username");
		String dbPassword = rb.getString("password");

		Class.forName(driver);
		conn = DriverManager.getConnection(url, dbUser, dbPassword);

		return conn;

	}

	public static void closeConnection() {
		return;
	}
}
