package application;

import java.util.Scanner;
import entities.BankAccount;

public class BankProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accNum = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Is there an initial deposit? Y/N ");
		char depIn = sc.next().charAt(0);
		double amount = 0;
		if(depIn=='Y'||depIn=='y') {
			System.out.print("Enter a deposit value: ");
			amount = sc.nextDouble();
		}
		BankAccount account = new BankAccount(accNum,nome,amount);
		
		System.out.println("\nAccount data:");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("\nUpdated account data:");
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println("\nUpdated account data:");
		System.out.println(account);
		
		sc.close();
	}
}
