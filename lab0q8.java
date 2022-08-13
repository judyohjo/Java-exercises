import java.util.Scanner;

public class InchesToCentimetres {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter inches: ");
		int inch = input.nextInt();
		
		double cm = inch * 2.54;
		
		System.out.printf("%d inches is approximately equal to %.0f centimetres.", inch, cm);
		
	}
}
