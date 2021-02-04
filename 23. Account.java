
public class Account {
	
	/*
	 * 1. Class parameters are the name of the account holdee(name : String), account password(password: 
	 * int), and account balance (balance: int).
	 * 2. 생성자는 3가지 멤버변수를 모두 매개값으로 받아 초기화하는 생성자를
	 * 선언하세요.
	 * 3. 메서드는 입금기능 메서드 (deposit : void), 출금기능 메서드
	 * (withDraw : void), 잔액 조회기능 메서드 (getBalance : int) 
	 * 3가지를 선언하세요.
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
