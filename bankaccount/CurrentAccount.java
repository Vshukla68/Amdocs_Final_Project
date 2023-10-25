package com.amdocs.bankaccount;

public class CurrentAccount extends BankAccount {
	private double withdrawl;

	public CurrentAccount(int accountID, double balance,double withdraw) {
		super(accountID, balance);
		this.withdrawl = withdraw;
		// TODO Auto-generated constructor stub
	}
	public void withdraw (double amount) {
		if (amount > 0) {
			if (amount + withdrawl <= checkBalance()) {
				super.withdraw(amount+withdrawl);
				System.out.println("withdraw " + amount + " with an INR 200 fee");
			}
			else
			{
				System.out.println("Insufficient amount for withdraw ");
			}
		}
		
	}
	

}
