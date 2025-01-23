package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PerparedDeleteTest {

	public static void main(String[] args) {
		
	
	
	//DB 정보
			String host = "jdbc:mysql://localhost:3306/studydb";
			String user = "root";
			String pass = "abc1234";
			
			
			try {
				//1단계 - JDBC드라이버 로드
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//2단계 - 데이터베이스 접속
				Connection conn =DriverManager.getConnection(host, user, pass);
				
				//3단계 - SQL 실행 객체 생성
				//쿼리 파라미터 ?를 사용해 쿼리문 작성
				String sql = "DELETE FROM `User1` WHERE `uid`=?";
				// prepared 객체 생성
				PreparedStatement psmt = conn.prepareStatement(sql);
				//쿼리 파라미터 맵핑(사상)
				psmt.setString(1, "j101");
				
				
				
				System.out.println(psmt);
				
				// 4단계 - SQL실행
				psmt.executeUpdate();
				
				// 5단계 - 조회결과 처리
					
				// 6단계 - 데이터베이스 종료
				psmt.close();
				conn.close();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("DELETE 완료...");
		}
	
}
