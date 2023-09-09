package practicePrograms;

import java.util.Scanner;

class Customer{
	private String name;
	private String address;
	
	public Customer(String name, String address) {
		this.name=name;
		this.address=address;
	}
}

class Account{
	private int accountnumber;
	private Customer accountHolder;
	private double balance;
	
	public Account(int accountNumber, Customer accountHolder, double balance) {
		this.accountnumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	
	public int getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}


	public Customer getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
		}
		else {
			System.out.println("Insufficient Balance!!");
		}
	}
}

public class BankingApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer name: ");
		String customerName=sc.nextLine();
		
		System.out.println("Enter Customer address: ");
		String customerAddress=sc.nextLine();
		
		Customer customer=new Customer(customerName, customerAddress);
		
		System.out.println("Enter account number: ");
		int accountNumber=sc.nextInt();
		
		System.out.println("Enter initial balance: ");
		double initialBalance=sc.nextDouble();
		
		Account account=new Account(accountNumber, customer, initialBalance);
		//System.out.println("Account Holder: "+account.getAccountHolder.getName());
		System.out.println("Account Balance: "+account.getBalance());
		
		System.out.println("Enter Deposit amount: ");
		double depositAmount=sc.nextDouble();
		account.deposit(depositAmount);
		
		System.out.println("Account Balance after deposit: "+account.getBalance());
		
		System.out.println("Enter withdrawal amount: ");
		double withdrawalAmount=sc.nextDouble();
		account.withdraw(withdrawalAmount);
		
		System.out.println("Account balance after withdrawal: "+account.getBalance());
		sc.close();

	}

}
