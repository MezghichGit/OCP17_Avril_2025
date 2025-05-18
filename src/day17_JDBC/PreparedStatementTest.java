package day17_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PreparedStatementTest {

	public static void register(Connection conn, int key, int type, String name) throws SQLException {
        String sql = "INSERT INTO names VALUES (?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setInt(2, type);
            ps.setString(3, name);
            //ps.executeUpdate();
            ps.executeUpdate(sql);
        }
    }
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo", "root", "");
		register(conn,1,2,"Ok");
		
		}

	}

