import java.util.Random;
import java.lang.Math;

public class BankAccount {
	private double accountNumber;
	private double balance;
	private String accountHolderName;
	private double interestRate;
	private int currency;
	private boolean frozen;

	public BankAccount(
		double accountHolderName, 
		String accountHolderPIN, 
		double balance
	) {
		frozen = false;
	}
	
	public BankAccount(
		String a, 
//		String accountHolderPIN, 
		double b, 
		double i
	) {
		Random rand = new Random();
		int upperbound = 10000;
		int int_random = rand.nextInt(upperbound);
		
		frozen = false;
		accountNumber = int_random;
		
		accountHolderName = a;
		balance = b;
		interestRate = i;
	}

	public double getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean getFrozen() {
		return frozen;
	}
	
	void deposit(double amount) {
		if (!frozen) {
			balance = balance + amount;
		}
	}
	void withdraw(double amount) {
		if (!frozen) {
			balance = balance - amount;
		}
	}
	
	void multiplyInterest(int amount) {
		balance = balance * (double) Math.pow(1 + interestRate / 100, amount);
	}

	void freeze() {
		frozen = true;
	}
	void unfreeze() {
		frozen = false;
	}
}