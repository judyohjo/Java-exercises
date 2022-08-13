import java.util.Scanner;

public class FootAndInches {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of inches: ");
		int inch = input.nextInt();
		int feet = inch/12;
		int remainder = inch % 12;
		if(feet != 1 && remainder != 1) {
			System.out.printf("That is %d feet and %d inches.", feet, remainder);
		} else if (feet != 1 && remainder == 1){
			System.out.printf("That is %d feet and %d inch.", feet, remainder);
		} else {
			System.out.printf("That is %d foot and %d inches.", feet, remainder);
		}
	}
	
	
}
