package org.day13.exception.ex;

class BankAccount {
	int balance;
	
	public int deposit(int account) {
		balance += account;
		return balance;
	}
	
	public void withdraw(int account) {
		if (account > balance) {
			throw new NegativeBalanceException();
		} else balance -= account;
	}
}
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		
		try {
			ba.deposit(1000);
			ba.withdraw(5000);
			System.out.println("ภÜพื : " +ba.balance);
		} catch(NegativeBalanceException n) {
			n.Negative();
		}
		System.out.println("ภÜพื : " + ba.balance);
	}

}
