
public class Account {
	
	/*
	 * 1. Class parameters - name of the account holdee(name : String), account password(password: 
	 * int), and account balance (balance: int).
	 * 2. Method - Deposit function method (deposit : void), withdrawl function method
	 * (withDraw : void), searching balance method (getBalance : int) 
	 */

	// Setting class parameters
	String name;
	int password;
	int balance;
	
	//creating a class, Account
	Account(String aName, int pw, int bal) {
		name = aName;
		password = pw;
		balance = bal;
	}
	
	//deposit function
	void deposit(int money) {
		balance += money;
	}
	
	//withdrawl function
	void withDrawMoney(int money) {
		balance -= money; //balance = balance - money
	}
	
	//search balance
	int getBalance() {
		return balance;
	}
}
