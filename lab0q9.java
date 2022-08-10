import java.util.Scanner;

public class Lab00C2F {
	public static void main(String[] args) {
	    Scanner input =  new Scanner(System.in);
	    System.out.println("Enter a temperature in degrees Celsius: ");
	    double celsius = input.nextDouble();
	    double fahrenheit = 32.0 + celsius * 9.0 / 5.0;
	    
	    System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit", celsius, fahrenheit);
	}
}
