package Ex8;

public class BankAccount implements Account {
	
	private int accountId;
	private static int accountIdStatic = 100999000;
	
	public BankAccount() {
		accountId = accountIdStatic;
		accountIdStatic = accountIdStatic + 1;
	}
		
	private int myWallet = 1000;
	
	@Override
	public void deposit(int amount) {
		this.myWallet = myWallet + amount;
		System.out.println("Current value of myWallet number: " + accountId + " is: " + myWallet);
	}

	@Override
	public void withdraw(int amount) {
		this.myWallet = myWallet - amount;
		System.out.println("Current value of myWallet number: " + accountId + " is: " + myWallet);
	}
}