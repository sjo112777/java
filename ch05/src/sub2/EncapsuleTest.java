package sub2;


/*
 * 날짜: 2025/01/07
 * 이름: 손준오
 * 내용: Java 클래스 캡슐화 실습하기
 */

public class EncapsuleTest {
	
	public static void main(String[] args) {
	
		//Car 객체 생성 초기화
		Car sonata = new Car("소나타", "흰색", 10);
		
		// 캡슐화된 속성은 외부에서 참조할 수 없음
		//sonata.name = "소나타";
		//sonata.color= "흰색";
		//sonata.speed = 10;
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반테","검정",10);
		
		avante.speedUp(60);
		avante.speedDown(50);
		avante.show();
		
		avante.setColor("흰색"); //setter를 이용해 속성 수정 
		avante.show();
		
		/*
		 * Account 객채 초기화(캡슐화 적용)
		 * <출력>
		 * 은행명:국민은행
		 * 계좌번호:110-11 -1011
		 * 
		 */
		Account kb = new Account("국민은행", "110-11-1101", "김유신", 1000);
		
		kb.deposit(30000);
		kb.withdraw(21000);
		kb.show();
		
		kb.setName("김유진");
		kb.show();
		
		
		Account wr = new Account("우리은행", "110-11-1211", "김춘추", 10000);
		
		wr.deposit(30000);
		wr.withdraw(21000);
		wr.show();
		
		wr.setBank("유리은행");
		wr.show();
		
		
		/*
		 * 도서관 관리 시스템의 일부로 Book 클래스를 정의하세요.
		*/
		Book book1 = new Book("삼국지", "나관중", "10001", 10);
		book1.show();
		
		boolean isOk = book1.borrowBook();
		
		if(isOk) {
			System.out.println(book1.getTitle() + "도서 대출 성공!");
		} else {
			System.out.println(book1.getTitle() + "도서 대출 실패!");
		}
		
		book1.show();
		
		Book book2 = new Book("이것이 자바다", "신용권", "10002", 0);
		book2.show();
		
		if(book2.borrowBook()) {
			System.out.println(book2.getTitle() + "도서 대출 성공!");
		} else {
			System.out.println(book2.getTitle() + "도서 대출 실패!");
		}
		
		
		
		Movie movie1 = new Movie("글래디에이터", "리들리스콧", 8.0 , 10 );
		
		
		if(movie1.reserveSeat()) {
			System.out.println(movie1.getTitle() + "영화좌석 예매완료!");
		} else {
			System.out.println(movie1.getTitle() + "영화좌석 예매실패!");
		}
		
		movie1.show();
		
		Movie movie2 = new Movie("타이타닉", "제임스카메론", 9.5 , 0);
		
		
		if(movie2.reserveSeat()) {
			System.out.println(movie2.getTitle() + "영화좌석예매완료");
		} else {
			System.out.println(movie2.getTitle() + "영화좌석예매실패!");
		}
		
		movie2.show();
		
		

	}
	
	
}
