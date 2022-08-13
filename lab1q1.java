import java.util.Scanner;

public class Color {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your favourite colour?");
		String colour = input.next();
		String lowercolour = colour.toLowerCase();
		
		int count = lowercolour.length();
		
		int i;
		
		for(i=0; i<count; i++) {
			System.out.printf("%s", "#");
		}
		
		System.out.printf("\n%s\n", lowercolour);
		
		for(i=0; i<count; i++) {
			System.out.printf("%s", "#");
		}
	
	}
}
