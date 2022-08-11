import java.util.Scanner;

public class Lab0011 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter principle: ");
    double principle = input.nextDouble();
    System.out.println("Enter time (number of years): ");
    int time = input.nextInt();
    System.out.println("Enter rate: ");
    double rate = input.nextDouble();
    
    double ci = principle * Math.pow((1 +  rate/100), time);
    		
    System.out.printf("Compound Interest = %.2f", ci);
    
  }
}
