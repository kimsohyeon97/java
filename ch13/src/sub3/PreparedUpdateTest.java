package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2025/01/22
 * 이름 : 한결
 * 내용 : Java CRUD 실습하기
 */

public class PreparedUpdateTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://localhost:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// 1단계 -JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			String sql = "update `user1` set `name`=?, `hp`=?, `age`=? ";
			       sql += "where `uid`=?";
						
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "한결");
			psmt.setString(2, "010-9102-3963");
			psmt.setInt(3, 26);
			psmt.setString(4, "A101");
			
			System.out.println(psmt);
			
			// 4단계 - SQL 실행
			psmt.executeUpdate();
			
			// 5단계 - 조회결과 처리 X
			
			// 6단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("업데이트 완료...");
	
		
	}
}
