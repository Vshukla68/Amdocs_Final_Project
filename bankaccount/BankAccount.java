package com.amdocs.bankaccount;

public class BankAccount {
	private int accountID;
	protected double balance;
	public double interestRate;
	
	public BankAccount(int accountID, double balance) {
		this.setAccountID(accountID);
		this.balance = balance;
		System.out.println("Account No " + this.accountID +" " + "created with balance "+ balance);
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Amount deposited to " + this.accountID);
		
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("Amount successfully withdrawn");
		}
		else {
			System.out.println("Amount is greater than balance");
		}
		
	}
	public double checkBalance() {
		System.out.println("Balance is " +balance);
		return balance;
		
	}
	public void transfer(double amount,BankAccount b2) {
		if(amount<=this.balance) {
			this.withdraw(amount);
			b2.deposit(amount);
			System.out.println("Amount transfer ");
			
		}
		else {
			System.out.println("Insufficient balance");
			
		}
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}


}
