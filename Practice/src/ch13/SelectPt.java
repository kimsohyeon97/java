package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class User1 {
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public User1 () {}
	
	public User1(String uid, String name, String hp, int age) {
		this.uid = uid;
		this.name = name;
		this.hp = hp;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "User1 [uid=" + uid + ", name=" + name + ", hp=" + hp + ", age=" + age + "]";
	}
	
	
}

public class SelectPt {
	public static void main(String[] args) {
		// DB 생성
		String host = "jdbc:mysql://127.0.0.1/studydb";
		String user = "root";
		String pass = "1234";
		
		List<User1> users = new ArrayList<User1>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			Statement stmt = conn.createStatement();
			
			String sql = "select * from `user1` ";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				User1 user1 = new User1();
				user1.setUid(uid);
				user1.setName(name);
				user1.setHp(hp);
				user1.setAge(age);
				
				users.add(user1);

			}		
			
			conn.close();
			stmt.close();
			rs.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		for(User1 user1 : users) {
			System.out.println(user1);
		}
	}
}
