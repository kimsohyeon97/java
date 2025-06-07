package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertPt {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "insert into `user1` values ('j101', '김유신', '010-1234-1001', 23)";
			stmt.executeUpdate(sql);
			
			// 5단계 - Result 결과 처리 (select일 경우만)
			
			// 6단계 - 데이터베이스 종료
			conn.close();
			stmt.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
	}
}
