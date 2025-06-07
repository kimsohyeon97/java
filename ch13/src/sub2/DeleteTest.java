package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025/01/22
 * 이름 : 김소현
 * 내용 : Java Delete 실습하기
 */

public class DeleteTest {
	public static void main(String[] args) {
		
		// DB 정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/StudyDB";
		final String USER = "root";
		final String PASS = "1234";
		
		try {
			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "delete from `user1` Where `uid`='j101' ";
			stmt.executeUpdate(sql);
			
			// 5단계 - ResultSet 결과 처리(Select 경우)
			
			// 6단계 - 데이터베이스 종료
			conn.close();
			stmt.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("delete 완료...");
	}
}
