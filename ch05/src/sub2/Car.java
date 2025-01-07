package sub2;

// Car 클래스 정의(설계)
public class Car {

	
	// 속성(멤버변수) - 클래스 속성은 캡슐화를 위해 무조건 private 선언
	private String name;
	private String color;
	private int speed;
	
	// 생성자 - 캡슐화된 속성을 초기화하기 위한 클래스 이름과 동일한 반환 타입이 없는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		
	}
	
	// 기능(멤버 메서드) - 클래스 기능은 무조건 public 선언
	public void speedUp(int speed) {
		// this 는 현재 클래스를 지칭
		// 속성 speed에 매개변수값 대입
		this.speed += speed;
		
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
}
