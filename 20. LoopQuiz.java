import java.util.Scanner;

public class LoopQuiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int drink = 5;
		
		while(true) {
			System.out.println("=======================");
			System.out.print("Input money: ");
			int money = scan.nextInt();
			
			if(money == 50) {
				System.out.println("Drink received");
				drink -= 1;
				System.out.println("There are " + drink + "remaining drinks.");
			} else if (money > 50) {
				System.out.println("Drink received");
				System.out.println("Change: " + (money - 50));
				drink -= 1;
				System.out.println("There are " + drink + "remaining drinks.");

			} else {
				System.out.println("Input more money. Input at least 50 cents.");
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
