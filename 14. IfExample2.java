import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert your score.");
		System.out.print("> ");
		int point = sc.nextInt(); 
		 
		if(point >= 85) {
			if(point > 100) {
				System.out.println("You didn't submit the correct score.");
			} else if(point >= 90) {
				System.out.println("Your grade is an A+.");
			} else {
				System.out.println("Your grade is an A.");
			}
		} else if(point >= 80) {
			System.out.println("Your grade is an A-.");
		} else if(point >= 70) {
			System.out.println("Your grade is a B.");
		} else if(point >= 50) {
			System.out.println("Your grade is a C.");
		} else {
			System.out.println("Your grade is a F.");
			System.out.println("You need to retake this paper.");
		}

	}

}
