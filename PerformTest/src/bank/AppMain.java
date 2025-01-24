package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {

	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();
	
	public static void main(String[] args) {
		
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3 ) {
				deposit();
			} else if (selectNo ==4) {
				withdraw();
			} else if (selectNo == 5) {
				isRunning = false;
			}
		}
		System.out.println("프로그램 종료");
		
	}
	private static void createAccount() {	//계좌생성
		 System.out.print("계좌번호: ");
	     String ano = scanner.nextLine();
	        
	     System.out.print("계좌주: ");
	     String owner = scanner.nextLine();
	        
	     System.out.print("초기입금액: ");
	     int balance = Integer.parseInt(scanner.nextLine());
	        
	     // 계좌 생성 후 accounts 리스트에 추가
	     Account newAccount = new Account(ano, owner, balance);
	     accounts.add(newAccount);
	        
	     System.out.println("결과: 계좌가 생성되었습니다.");
	    }
	
	
	private static void accountList() {	//계좌 목록 출력
		if (accounts.isEmpty()) {
			System.out.println("저장된 계좌가 없습니다.");
            return;
        }
        
        for (Account account : accounts) {
            System.out.println("계좌번호: " + account.getAno() +
                               ", 소유자: " + account.getOwner() +
                               ", 잔액: " + account.getBalance());
        }
	}

	private static void deposit() {	//예금
		System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        
        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("해당 계좌를 찾을 수 없습니다.");
            return;
        }
        
        System.out.print("예금액: ");
        int depositAmount = Integer.parseInt(scanner.nextLine());
        
        int newBalance = account.getBalance() + depositAmount;
        account.setBalance(newBalance);
        
        System.out.println("예금이 성공되었습니다.");
	}

	private static void withdraw() {	//출금
		System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        
        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("해당 계좌를 찾을 수 없습니다.");
            return;
        }
        
        System.out.print("출금액: ");
        int withdrawAmount = Integer.parseInt(scanner.nextLine());
        
        if (account.getBalance() >= withdrawAmount) {
            int newBalance = account.getBalance() - withdrawAmount;
            account.setBalance(newBalance);
            System.out.println("출금이 성공되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
	}

	private static Account findAccount(String ano) {	//계좌검색
		   for (Account account : accounts) {
	            if (account.getAno().equals(ano)) {
	                return account;
	            }
	        }
	        return null;
		
	}
	
}
