package lab8;

import java.io.*;

public class InsufficientFundsException extends Exception {

	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	
	public InsufficientFundsException(String message) {
		super(message);
	}
}