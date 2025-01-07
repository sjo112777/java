package sub2;

// Account 클래스 정의(설계)
public class Account {

	// 속성(멤버변수) - 클래스 속성은 캡슐화를 위해 무조건 private 선언
	// 속성(필드, 멤버 변수)
	private String bank;
	private String id;
	private String name;
	private int balance;
	
	// 생성자 - 캡슐화된 속성을 초기화하기 위한 클래스 이름과 동일한 반환 타입이 없는 메서드
		public Account(String bank, String id, String name, int balance) {
			this.bank = bank;
			this.id = id;
			this.name = name;
			this.balance = balance;
			
		}
	
	// 기능
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
		
	}
	
	public void show() {
		System.out.println("--------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주: " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("--------------------");
		
	}
	// Getter, Setter 정의 (옵션) - 캡슐화된 속성을 수정하기 위한 메서드
	public String getBank() {
		return bank;
	}
	public String getId() {
		return id;
	}
	public int getBalance() {
		return balance;
	}	
	
	public String getName() {
		return name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
