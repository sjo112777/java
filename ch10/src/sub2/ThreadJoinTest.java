package sub2;

/*
 * 날짜: 2025/01/20 
 * 이름: 손준오
 * 내용: Java 스레드Join 실습하기
 */

class WorkThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i<10; i++) {
			System.out.println("WorkThread..." + i);
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
}


public class ThreadJoinTest {

	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		work.start();
		
		try {
			//스레드 종료 대기
			work.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료..."); //프로그램 종료
		
		
	}
	
}
