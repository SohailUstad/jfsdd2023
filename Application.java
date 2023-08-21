class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private Long balance;
	private static int sequence;

	public BankAccount(String name) {
		sequence++;
		this.balance=0L;
		this.accountNumber = "500146" + sequence;
		this.accountHolderName = name;
	}

	public void deposite(Long amount) {
		if (amount == 0) {
			System.out.println("Deposite amount cannot be 0");
			return;
		}
		if (amount < 0) {
			System.out.println("Deposite amount cannot be negative");
			return;
		}
		if (amount > 10000) {
			System.out.println("You cannot deposite more than 10000 at once");
			return;
		}
		this.balance += amount;
		System.out.println("Depositted "+amount+" to your account");
	}
	
	public void withdraw(Long amount) {
		if(amount>balance) {
			System.out.println("Insufficient account balance");
			return;
		}
		if(amount==0) {
			System.out.println("You cannot withdraw 0 rupees");
			return;
		}
		if(amount<0) {
			System.out.println("Amount to withdraw cannot be negative");
			return;
		}
		this.balance-=amount;
		System.out.println("Withdrawn "+amount+" from your account");
	}
	public void checkBalance() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Account Holder Name: "+this.accountHolderName);
		System.out.println("Current Balance: "+this.balance);
		System.out.println("----------------------------------------------------------------");
	}
}

public class Application {
	public static void main(String[] args) {

		BankAccount ac1 = new BankAccount("Sohail Usmangani Ustad");
		ac1.checkBalance();
		ac1.deposite(1000L);
		ac1.checkBalance();
		ac1.withdraw(500L);
		ac1.checkBalance();
		
		
		
		BankAccount ac2 = new BankAccount("Sohail Usmangani Ustad");
		ac2.checkBalance();
		ac2.deposite(10500L);
		ac2.checkBalance();
		ac2.withdraw(500L);
		ac2.checkBalance();

	}
}
