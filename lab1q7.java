import java.util.Scanner;

public class SmallestN {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("");
      int num = input.nextInt();
      
      double num2 = Math.sqrt(num);
      
      int num3 = (int) (num2 + 1);
      System.out.printf("The smallest n such that n^2 > %d is %d.", num, num3);
   }
}
