import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {
		/*
		 * This programme adds two additions. 
		 * Example - What is 27 + 84 = ?
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int okCount = 0;
		int noCount = 0;
		
		while(true) {
			int rn1 = (int)(Math.random() * 100) + 1;
			int rn2 = (int)(Math.random() * 100) + 1;
			
			System.out.println("----------------");
			System.out.println(rn1 + " + " + rn2 + " = ? ");
			System.out.println("[Input 0 to end solving the problem.");
			System.out.print("> ");
			
			int correct = rn1 + rn2;
			int answer = scan.nextInt();
			
			if(answer == 0) {
				System.out.println("The programme will end.");
				break;
			}
			if(answer == correct) {
				System.out.println("You got it right!");
				okCount++;
			} else {
				System.out.println("It's incorrect");
				noCount++;
			}
			
		}
		System.out.println("--------------------------");
		System.out.println("Number of corrects: " + okCount);
		System.out.println("Number of incorrects: " + noCount);
		
		scan.close();
	}

}
