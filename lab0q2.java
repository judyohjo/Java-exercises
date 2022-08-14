import java.util.Scanner;

public class SquareRoot {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter an integer: ");
       int num1 = input.nextInt();
       double d = Math.sqrt(num1);
       System.out.printf("Square root of %d = %.2f", num1, d);
   }

}
