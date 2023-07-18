import java.util.Random;

public class BankAccountTest {
	public static void main(String [] args) {
		BankAccount bank = new BankAccount("Gordon Liang", 1_000_000, 50);
		System.out.println(bank.getAccountHolderName());
		System.out.println(bank.getAccountNumber());
		System.out.println(bank.getBalance());
		System.out.println();
		
		bank.deposit(1_000);
		System.out.println(bank.getBalance());
		bank.withdraw(3_000);
		System.out.println(bank.getBalance());
		
		bank.freeze();
		bank.deposit(2_000);
		System.out.println(bank.getBalance());
		bank.unfreeze();
		bank.deposit(2_000);
		System.out.println(bank.getBalance());
		
		bank.multiplyInterest(7);
		System.out.println(bank.getBalance());
		
		System.out.println(bank.getFrozen());
	}
	
}