import java.util.Scanner;

public class Triangle {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter side1 of a triangle: ");
      double side1 = input.nextDouble();
      System.out.println("Enter side2 of a triangle: ");
      double side2 = input.nextDouble();
      System.out.println("Enter side3 of a triangle: ");
      double side3 = input.nextDouble();
      
      double sum1 = side1 + side2;
      double sum2 = side1 + side3;
      double sum3 = side2 + side3;
      
      if((sum1 > side3) && (sum2 > side2) && (sum3 > side1)) {
    	  System.out.println("Valid Triangle!");
      } else {
    	  System.out.println("Invalid Triangle!");
      }
   }
}
