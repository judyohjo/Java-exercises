import java.util.Scanner;

public class SumOfPositiveNumbers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a positive integer: ");
      int num = input.nextInt();
      
      double sum = num * (num+1.0)/2.0;
      
      System.out.printf("The sum of the first %d positive integers is %.0f.", num, sum);
      
      
   } 
} 
