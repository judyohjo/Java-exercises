import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int num1 = input.nextInt();
		System.out.print("");
		int num2 = input.nextInt();
		System.out.print("");
		int num3 = input.nextInt();
		
		int gcd = 0;
		
		if(num1 <= 0 || num2 <= 0 || num3 <=0) {
			gcd = -1;
		}
		
		for(int i=1; i<=num1 && i<=num2 && i<=num3; i++) {
			if(num1 % i == 0 && num2 % i == 0 && num3 %i == 0) {
				gcd = i;
			}
		}
		
		System.out.println("Enter a number1: ");
		System.out.println("Enter a number2: ");
		System.out.println("Enter a number3: ");
		System.out.printf("The greatest common divisor is: %d", gcd);
			
	}
}
