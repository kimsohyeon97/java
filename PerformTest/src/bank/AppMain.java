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
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) {
				createAccount();
			}else if (selectNo == 2) {
				accountList();
			}else if (selectNo == 3) {
				deposit();
			}else if (selectNo == 4) {
				withdraw();
			}else if (selectNo == 5) {
				isRunning = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("계좌 번호: ");
		String ano = scanner.nextLine();
		System.out.println("계좌주: ");
		String owner = scanner.nextLine();

		int balance = 0;
	    while (true) {
	        try {
	            System.out.print("초기입금액: ");
	            String input = scanner.nextLine().trim();  
	            if (input.isEmpty()) {
	                System.out.println("입금액을 입력해 주세요.");
	                continue;
	            }
	            balance = Integer.parseInt(input);
	            if (balance < 0) {
	                System.out.println("입금액은 0원 이상이어야 합니다.");
	            } else {
	                break;
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("입금액은 숫자만 입력 가능합니다.");
	        }
	    }

	    Account account = new Account(ano, owner, balance);
	    accounts.add(account);
	    System.out.println("계좌가 생성되었습니다.");
	}
	private static void accountList() {
		if (accounts.isEmpty()) {
			System.out.println("등록된 계좌가 없습니다.");
			return;
		}
		
		for(Account account : accounts) {
			System.out.println(account.getAno() + " " + account.getOwner() + " " + account.getBalance());
		}
	}
	

	private static void deposit() {
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		Account account = findAccount(ano);
		
		if (account != null) {
	        System.out.print("예금액: ");
	        String input = scanner.nextLine().trim();
	        
	        if (input.isEmpty()) {
	            System.out.println("예금액을 입력해주세요.");
	            return;
	        }
	        
	        try {
	            int amount = Integer.parseInt(input);
	            
	            if (amount <= 0) {
	                System.out.println("예금액은 0보다 큰 숫자여야 합니다.");
	                return;
	            }
	            
	            account.setBalance(account.getBalance() + amount);

	            System.out.println("결과: 예금이 성공되었습니다.");
	            
	        } catch (NumberFormatException e) {
	            System.out.println("입금액은 숫자만 입력 가능합니다.");
	        }
	        
	    } else {
	        System.out.println("존재하지 않는 계좌입니다.");
	    }
	}
	
	private static void withdraw() {
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		Account account = findAccount(ano);
		
		if(account != null) {
			System.out.println("출금액: ");
			int amount = Integer.parseInt(scanner.nextLine());
			
			if(account.getBalance() >= amount) {
				account.setBalance(account.getBalance() - amount);
				System.out.println("결과: 출금이 성공되었습니다.");
			}else {
				System.out.println("잔액이 부족합니다.");
			}
		}else {
			System.out.println("존재하지 않는 계좌입니다.");
		}
	}
	

	private static Account findAccount(String ano) {
		for(Account account : accounts) {
			if(account.getAno().equals(ano)) {
				return account;
			}
		}
		return null;
	}

}
