/*Bank Account Management System
Create a simple Bank Account Management System that allows users to perform basic
operations such as depositing money, withdrawing money, and checking their account
balance.
Tasks:
a. Define a class named BankAccount with the following attributes:
i. accountNumber: Unique identifier for each bank account.
ii. accountHolderName: Name of the account holder.
iii. balance: Current balance in the account.
b. Implement appropriate constructors and methods for the BankAccount class:
i. Include methods to deposit money into the account, withdraw money from
the account, and check the account balance.
ii. Ensure that the balance cannot be negative after a withdrawal.
c. Create a main program to interact with the BankAccount class:
i. Allow users to perform operations such as depositing money, withdrawing
money, and checking their account balance using a simple menu-driven
interface.
ii. Prompt users to enter the necessary information for each operation (e.g.,
account number, account holder name, amount to deposit/withdraw).
iii. Display appropriate messages to indicate the success or failure of each
operation.*/

package com.java_assignment;

import java.util.Scanner;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	Scanner sc=new Scanner(System.in);
	

	public BankAccount() 
	{
		accountNumber = 20098765;
		accountHolderName= " Pradnya ";
		balance = 800000;
		
	
	}
	public BankAccount(int accountNumber,String accountHolderName,double salary)
	{
		this.accountNumber =accountNumber;
		this.accountHolderName = accountHolderName ;
		this.balance=balance;
	}
	public void depositMoney() {
		double amount;
		System.out.println("Enter the amount you want to deposit : ");
		
		amount=sc.nextDouble();
		
		balance=balance+amount;
		
		
		
		
		
	}
	public void withdrawMoney() {
		long amount = 0;
		System.out.println("Enter the amount you want to withdraw :");
		if(balance>amount) {
			balance=balance-amount;
			System.out.println("balance after withdrawal :"+balance);
		}
		else
		{
			 
			System.out.println(" your balane is less "+amount  +"\transaction failed " );
			
		}
	}
	public void checkBal() {
		System.out.println("the balance is :");
		
	}
	
	
}
