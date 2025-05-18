package day17_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestScrolable_ResultSet {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo", "root", "");

		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery("select id from species order by id");
		rs.afterLast();
		System.out.println(rs.previous()); // true 
		System.out.println(rs.getInt(1)); // 2
		
		System.out.println(rs.previous()); // true
		System.out.println(rs.getInt(1)); // 1 
		
		System.out.println(rs.last()); // true 
		System.out.println(rs.getInt(1));
											// // 2 
		System.out.println(rs.first()); // true
											// 
		System.out.println(rs.getInt(1)); // 1 
		
		rs.beforeFirst();
											// 
		System.out.println(rs.getInt(1)); // throws SQLException

	}

}
