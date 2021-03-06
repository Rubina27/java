package test;
import java.util.*;


public class Bank {
	
	Scanner in = new Scanner(System.in);
	String name;
	String cust_id;
	double balance;
	int account_no;
	
	// Constructor
	Bank(String name, String cust_id, double balance, int account_no){
		this.name = name;
		this.cust_id = cust_id;
		this.balance = balance;
		this.account_no = account_no;
	}
	
	// Add the amount to the balance of the object that is calling it.
	void deposit(){
		System.out.println("Enter the amount to deposit: ");
		double amount = in.nextDouble();
		this.balance = this.balance + amount;
		
	}
	
	void display(){
		System.out.println(" Name : " + this.name);
		System.out.println(" Your balance is : " + this.balance);
	}
	
	// If the withdrawl amount > the balance of the object that is calling it, => error
	// otherwise subtract the amount from it's balance.
	void withdraw(){
		System.out.println("Enter the amount to withdraw: ");
		double amount = in.nextDouble();
		if (amount > this.balance){
			System.out.println("Gareeb");
		}
		else{
			this.balance = this.balance - amount;
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How many account details?");
		int n = input.nextInt();
		System.out.println(n);
		
		Bank[] ob = new Bank[n];
		for(int i=0; i<n; i++){
			System.out.println("Name?");
			String nam = input.next();
			
			System.out.println("Customer ID?");
			String cid = input.next();
			
			System.out.println("Balance?");
			double bal = input.nextDouble();
			
			System.out.println("Account Number?");
			int acc_no = input.nextInt();
			
			ob[i] = new Bank(nam, cid, bal, acc_no);
			
			System.out.println("Input stored");
			
			// ob[i].display();
		}
		
		
		System.out.println("People with balance > 5000: ");
		for(int i=0; i<n; i++){
			if (ob[i].balance > 5000){
				ob[i].display();
			}
		}
	}
}
	
