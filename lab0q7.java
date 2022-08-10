import java.util.Scanner;

public class Q1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a radius: ");
      int radius = input.nextInt();
      System.out.println("Enter a height: ");
      int height = input.nextInt();
      double d = 1.0/3.0;
      double cone = Math.ceil(d * Math.PI * radius * radius * height);
      
      System.out.printf("Volume of cone is %.0f cubic cm.", cone);
   }
}
