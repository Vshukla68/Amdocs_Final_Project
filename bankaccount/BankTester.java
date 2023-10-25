package com.amdocs.bankaccount;

public class BankTester {
	public static void main(String[] args) {
		
		BankAccount B1 = new BankAccount(10, 500);
		BankAccount B2 = new BankAccount(20, 200);
		
		B1.withdraw(200);
		B2.deposit(1000);
		B2.transfer(500, B1);
		B1.checkBalance();
		B2.checkBalance();
		
		
		SavingAccount S1= new SavingAccount(0.03, 10, 2000);
		S1.deposit(500);
		System.out.println("Saving Account Balance " + S1.checkBalance());
		
		
		
    	CurrentAccount C1 =new CurrentAccount(30, 2000,200);
		C1.deposit(500);
		C1.withdraw(100);
		C1.transfer(500, S1);
		C1.checkBalance();
		S1.checkBalance();
		
	}

}
