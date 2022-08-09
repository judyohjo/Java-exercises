import java.util.Scanner;

public class Ohm {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a voltage measured in volts (integer): ");
      System.out.println("Enter a resistance measured in ohms (integer): ");
      
      double num1 = input.nextDouble();
      double num2 = input.nextDouble();
      double d = num1/num2;
      
      System.out.printf("The current flowing through is: %.2f.", d);
      
      
   } // end main
} // end class
