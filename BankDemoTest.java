package lab8;

import java.util.Scanner;

//import InsufficientFundsException.java;
public class BankDemoTest {

	public static void main(String args[]) {

		try {
			CheckingAccount acc = new CheckingAccount();
			double deposit, withdraw, balance;
			double shortOf;
			Scanner scan = new Scanner(System.in);
			System.out.println("Deposit $x into account: ");
			deposit = scan.nextDouble();
			acc.deposit(deposit);
			System.out.println("Your new balance is $" + acc.getBalance());
			System.out.println("Key in amt to withdraw: ");
			withdraw = scan.nextDouble();

			acc.withdraw(withdraw);

			System.out.println("Balance after withdraw is $" + acc.getBalance());

		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
