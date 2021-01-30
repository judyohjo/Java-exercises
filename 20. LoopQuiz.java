import java.util.Scanner;

public class LoopQuiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int drink = 5;
		
		while(true) {
			System.out.println("=======================");
			System.out.print("Input money: ");
			int money = scan.nextInt();
			
			if(money == 500) {
				System.out.println("Drink received");
				drink -= 1;
				System.out.println("There are " + drink + "remaining drinks.");
			} else if (money > 500) {
				System.out.println("Drink received");
				System.out.println("Change: " + (money - 500));
				drink -= 1;
				System.out.println("There are " + drink + "remaining drinks.");

			} else {
				System.out.println("Input more money. 돈이 부족합니다. 최소 500원을 넣어주세요.");
				System.out.println("There are " + drink + "remaining drinks.");

			}
			if(drink==0) {
				System.out.println("There are no more drinks available.");
				break;
			}
		}
		scan.close(); 

	}

}
