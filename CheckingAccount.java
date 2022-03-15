package lab8;

public class CheckingAccount {
	//private double deposit;
	//private double withdraw;
	private double balance = 0;
	private String num;
	//private double shortOf;

	public double getBalance() {
		return balance;
	}

	public void deposit(double dep) {
		balance += dep;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) throw new InsufficientFundsException(String.format("Sorry, but your current account is short by $%.2f.", amount-balance));
        
        balance -= amount;
        System.out.printf("The balance after withdraw is: $%.2f.", balance);
    }
	
	public String getNumber() {
		return this.getNumber();
				
	}

}
