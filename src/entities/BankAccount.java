package entities;

public class BankAccount {

	private int accountNum;
	private String name;
	private double balance;
	
	public BankAccount(int accountNum, String name, double amount) {
		this.accountNum = accountNum;
		this.name = name;
		deposit(amount);
	}

	public int getNumeroConta() {
		return accountNum;
	}
	
	public double getSaldo() {
		return balance;
	}
	
	public String getNomeTitular() {
		return name;
	}

	public void setNomeTitular(String name) {
		this.name = name;
	}

	public String toString() {
		return "Account " + accountNum + ", Holder: " + name + ", balance: $" + String.format("%.2f", balance);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= (amount+5);
	}
}
