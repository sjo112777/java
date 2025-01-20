package sub5;

/*
 * 날짜: 2025/01/20
 * 이름: 손준오
 * 내용: Java wait(),notify() 교재 p616 실습하기
 */

public class WaitNotifyExample {
	
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
	}

}
