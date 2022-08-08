import java.util.Scanner;

public class LabTriangle{
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the height of a triangle: ");
	double d1 = input.nextDouble();
	System.out.println("Enter the base of a triangle: ");
	double d2 = input.nextDouble();
	
	System.out.printf("Area of a triangle is %.1f", (d1*d2)/2);
   }
}
