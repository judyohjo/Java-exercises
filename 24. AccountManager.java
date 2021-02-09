import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Make an account.");
		System.out.print("Name: ");
		String name = scan.next();
		System.out.print("Password: ");
		int passwd = scan.nextInt();
		System.out.print("Amount for deposit: ");
		int balance = scan.nextInt();
		
		Account acc = new Account(name, passwd, balance);
		
		while(true) {
			System.out.println("\nWhat do you want to do?");
			System.out.println("1. Deposit | 2. Withdrawl | 3. Search balance | 4. End");
			System.out.print("> ");
			int menu = scan.nextInt();
			
			if(menu==1) {
				System.out.println("Type your password.");
				System.out.print("> ");
				int pw = scan.nextInt();
				
				if(pw == acc.password) {
					System.out.println("Type how much you want to deposit.");
					System.out.print("> ");
					int money = scan.nextInt();
					//???? (calling deposit method)
					acc.deposit(money);
					System.out.println(money + "원 입금이 완료되었습니다.");
				} else {
					System.out.println("The password is wrong.");
				}
			} else if(menu==2) {
				System.out.print("> ");
				int pw = scan.nextInt();
				if(pw == acc.password) {
					System.out.println("Type how much you want to withdrawl.");
					System.out.print("> ");
					int money = scan.nextInt();
					if(money > acc.balance) {
						System.out.println("You don't have enough balance.");
					} else {
						//???? (calling withdrawl method)
						acc.withDrawMoney(money);
						System.out.println("You have withdrawled $" + money);
					}
				} else {
					System.out.println("The password is wrong.");
				}
			} else if(menu==3) {
				System.out.println("Type your password.");
				System.out.print("> ");
				int pw = scan.nextInt();
				if(pw == acc.password) {
					int bal = acc.getBalance();
					
					System.out.println("The account for" + acc.name + ", has $"  + bal);
				} 
			} else {
				break;
			}
			
		}//end while
		scan.close();

	}//end main

} //end class
