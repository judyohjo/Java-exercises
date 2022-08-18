import java.util.Scanner;

public class CreatingPyramidOfStars {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("");
      int num1 = input.nextInt();
      
      System.out.println("Enter number of rows: ");
      
      for(int i=1; i<=num1; i++) {
    	  for(int j=1; j<=i; j++) {
    		  if(j==i || j==1 || i==num1) {
    			  System.out.print("*");
    		  } else {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.print("\n");
      }
   }
}
