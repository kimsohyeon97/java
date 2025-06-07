package ch05;

public class BankAccount {

	private int accountNumber;
	private String owner;
	private int balance;
	
	public BankAccount(int accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		amount += amount;
	}
	
	public void withdraw(int amount) {
		amount -= amount;
	}
	
	public void showAccountInfo() {
		System.out.println("게좌번호 : " + accountNumber);
		System.out.println("계좌주 : " + owner);
		System.out.println("잔액 : " + balance);
	}
	
	
	
}
