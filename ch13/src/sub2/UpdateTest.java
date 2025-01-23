package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		
		// DB 정보
		String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		String USER = "root";
		String PASS = "abc1234";
		
		
		try {
			
			// 1단계 -
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계-
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3단계-
			Statement stmt = conn.createStatement();
			
			// 4단계-
			String sql = "UPDATE `User1` SET `name`='김유진', `hp`='010-1234-1011' "
						+ "WHERE `uid`='j101'";
			
			stmt.executeUpdate(sql);
			
			// 5단계-
			// 6단계-
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("UPDATE 완료...");
	}
	
	
}
