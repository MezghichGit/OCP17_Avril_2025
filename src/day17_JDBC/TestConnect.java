package day17_JDBC;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class TestConnect {
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo", "root", "");
		//System.out.println(conn);
		Statement stmt = conn.createStatement();
		/*		
		int result = stmt.executeUpdate("insert into species values(1, 'African Elephant', 3)");
		System.out.println(result); // 1
		
		
		result = stmt.executeUpdate("insert into species values(2, 'Zebra', 4)");
		System.out.println(result);
		*/
		//int result = stmt.executeUpdate("update species set name = 'ok' where name = 'Deer'");
		//System.out.println(result);
		//int result = stmt.executeUpdate("delete from species where id = 10");
		//System.out.println(result); // 1
		
		Map<Integer, String> idToNameMap = new HashMap<>();
		
		ResultSet rs = stmt.executeQuery("select id, name from species");
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			idToNameMap.put(id, name);
		}
		System.out.println(idToNameMap); 
	}
}
