package bank;


public class Account {

		private String ano; 	//계좌번호
		private String owner;	//입금주
		private int balance;	//잔고
		
		public Account(String ano, String owner, int balance) {
			
			this.ano = ano;
			this.owner = owner;
			this.balance = balance;
				
			}
		
		
		public String getAno() {				//속성 ano의 getter
			return ano;
		}
		
		public String getOwner() {				//속성 owner의 getter
			return owner;
		}
		
		public int getBalance() {				//속성 balance의 getter
			return balance;
		}
		
		public void setBalance(int balance) {	//속성 ano의 setter
			this.balance = balance;
		}
		
		
}

	

