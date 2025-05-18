package day17_JDBC;

import java.sql.*;
public class TestConnect {
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","");
		System.out.println(conn);
		}
	} 
