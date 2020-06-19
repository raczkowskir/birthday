package Ex8;

public final class Bank implements BankTransfer {

	private int bankAccounOnCayman = 0;
	
    public void transfer(BankAccount from, BankAccount to, int amount) {
    	from.withdraw(amount + 1);
    	to.deposit(amount);
    	
    	bankAccounOnCayman = bankAccounOnCayman + 1;
    	System.out.println("BankAccounOnCayman: " + bankAccounOnCayman);
	}

    private static void doYourJob() {
    	
    	Bank globalBank = new Bank();
		BankAccount myBankAccount = new BankAccount();
		BankAccount yourBankAccount = new BankAccount();

		System.out.println("myBankAccount hashCode: " + myBankAccount.hashCode());
		System.out.println("myBankAccount yourBankAccount: " + yourBankAccount.hashCode());
		System.out.println("Is equal: " + myBankAccount.equals(yourBankAccount));
		
		
		for (int i = 0; i < 5; i++) {
			globalBank.transfer(myBankAccount, yourBankAccount, 10);			
		}
		
		System.out.println("myBankAccount hashCode: " + myBankAccount.hashCode());
		System.out.println("myBankAccount yourBankAccount: " + yourBankAccount.hashCode());
		System.out.println("Is equal: " + myBankAccount.equals(yourBankAccount));
    }
    
	public static void main(String[] args) {
		doYourJob();
	}

}
