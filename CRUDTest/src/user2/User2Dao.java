package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User2Dao {

	private static User2Dao instance = new User2Dao();
	public static User2Dao getInstance() {
		return instance;
	}
	private User2Dao() {}
	
	private final String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final String USER = "root";
	private final String PASS = "1234";
	
	public Connection getcoConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);		
	}
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	public void insertUser1(User1 user) {
		try {
			conn = getcoConnection();
			psmt = conn.prepareStatement(HOST);
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}













