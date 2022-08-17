import java.util.Scanner;

public class StartToEndNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the start number: ");
		int start = input.nextInt();
		System.out.println("Enter the end number: ");
		int end = input.nextInt();
		
		int i;
		
		System.out.print("Values: ");
		
		for(i=start; i<=end; i++) {
			System.out.printf("%d ", i);
		}
	}
}
