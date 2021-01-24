import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {
		/*
		 * 1. 두 수의 더하기를 맞추는 문제를 지속적으로 
		 * 출제하는 프로그램입니다.
		 * 2. 2가지의 정수를 1~100사이의 난수를 발생 시켜 
		 * 지속적으로 문제를 출제한 후 정답을 맟주면
		 * 반복문을 탈출시키세요.
		 * 3. 27 + 84 = ?
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
				System.out.println("프로그램을 종료합니다.");
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
