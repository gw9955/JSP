package kr.or.ddit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");

		} catch (ClassNotFoundException ex) {
			System.out.println("드라이버 로딩 실패");
		}
	}

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc15", "java");
		} catch (SQLException ex) {
			System.out.println("DB 연결 실패");
			ex.printStackTrace();
			return null;
		}
	}

	/*
	 * 자원반납 메소드
	 */
	public static void close(Connection conn, Statement stmt, PreparedStatement pstmt, ResultSet rs) {
		if (rs != null) try {rs.close();}catch (SQLException ex) {}
		if (stmt != null) try {stmt.close();}catch (SQLException ex) {}
		if (pstmt != null) try {pstmt.close();}catch (SQLException ex) {}
		if (conn != null) try {conn.close();}catch (SQLException ex) {}
			
	}
	
}
