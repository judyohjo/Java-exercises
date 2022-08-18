import java.util.Scanner;

public class Stars {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of rows: ");
      int row = input.nextInt();
      System.out.println("Enter number of columns: ");
      int column = input.nextInt();
    
      int j;
      int i;
      int space;
      String stars_list = "";
      
      for(i=0; i<column; i++) {
    	  stars_list += "*";
      }
      
      for(j=row; j>0; j--) {
    	  for(space=1; space<j; space++) {
    		  System.out.print(" ");
    	  }
    	  System.out.printf("%s\n", stars_list);
    	  
      }
   }
   
}
