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
				System.out.println("계좌 비밀번호를 입력하세요.");
				System.out.print("> ");
				int pw = scan.nextInt();
				
				if(pw == acc.password) {
					System.out.println("입금액을 입력하세요.");
					System.out.print("> ");
					int money = scan.nextInt();
					//???? (입금기능 메서드 호출)
					acc.deposit(money);
					System.out.println(money + "원 입금이 완료되었습니다.");
				} else {
					System.out.println("The password is wrong.");
				}
			} else if(menu==2) {
				System.out.print("> ");
				int pw = scan.nextInt();
				if(pw == acc.password) {
					System.out.println("출금액을 입력하세요.");
					System.out.print("> ");
					int money = scan.nextInt();
					if(money > acc.balance) {
						System.out.println("You don't have enough balance.");
					} else {
						//???? (출금기능 메서드 호출)
						acc.withDrawMoney(money);
						System.out.println(money + "원 출금 완료했습니다.");
					}
				} else {
					System.out.println("The password is wrong.");
				}
			} else if(menu==3) {
				System.out.println("계좌 비밀번호를 입력하세요.");
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
