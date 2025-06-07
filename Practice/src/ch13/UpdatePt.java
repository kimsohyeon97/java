package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatePt {
	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/StudyDB";
		String user = "root";
		String pass = "1234";
		
		try {
			// JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "update `user1` set `name`='김유신', `age`=53 where `uid`='j101'";
			stmt.executeUpdate(sql);
			
			// 데이터베이스 종료
			conn.close();
			stmt.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("update 완료...");
	}
}
