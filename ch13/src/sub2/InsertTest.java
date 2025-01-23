package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTest {
	
	public static void main(String[] args) {
		
		//DB정보
		String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		String USER = "root";
		String PASS = "abc1234";
		
		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			//4단계 - SQL 실행
			String sql = "INSERT INTO `User1` VALUES ('j101', '김유신', '010-1234-1001', 23)";
			stmt.executeUpdate(sql);
			
			//5단계 - ResultSet 결과 처리(Select 경우)
			
			//6단계 - 데이터베이스 종료
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");

	}
}
