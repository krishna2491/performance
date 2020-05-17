package com.gomap.performance.master.aop.logging;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
	static Connection con = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				
			if (con != null) {
				System.out.println("connect");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
