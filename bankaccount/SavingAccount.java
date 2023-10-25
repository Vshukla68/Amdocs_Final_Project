package com.amdocs.bankaccount;

public class SavingAccount extends BankAccount{
	private double interestRate;
	
	public SavingAccount(double interestRate, int accountID, double balance) {
		super(accountID,balance);
		this.interestRate=interestRate;
	}
	public void deposit(double amount) {
		if (amount>0) {
			double interest = amount *interestRate;
			super.deposit( amount +interest);
			System.out.println("Deposited " + amount +" "+ "with interest of " + interest + " applied.");
		}
	}
	

}
