package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine(); //consumindo a quebra de linha
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double withdrawAmount = sc.nextDouble();
			account.withdraw(withdrawAmount);
			System.out.println("New balance: " + account.getBalance());
			
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
