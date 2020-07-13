package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AllExceptions;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int accountNumber = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account acc = new Account(accountNumber, holder, balance, withdrawLimit);
	
			System.out.print("Enter ammount for withdraw: ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
			
			System.out.println(acc.toString());		
		}
		catch (AllExceptions e) {
			System.out.println("Error on withdraw attempt: " + e.getMessage());
		}
		
		sc.close();
	}

}
