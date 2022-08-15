import java.util.Scanner;

public class SquaredCubeNumber {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first integer: ");
      System.out.println("Enter the second integer: ");
      System.out.println("Enter the third integer: ");
      
      int num1 = input.nextInt();
      System.out.printf("%5d %4d %4d%n", num1, square(num1), cube(num1));
      
      int num2 = input.nextInt();
      System.out.printf("%5d %4d %4d%n", num2, square(num2), cube(num2));
      
      int num3 = input.nextInt();
      System.out.printf("%5d %4d %4d%n", num3, square(num3), cube(num3));
      
  }
  public static int square(int num) {
	  return num * num;
  }
  public static int cube(int num) {
	  return num * num * num;
  }
}
