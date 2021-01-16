import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input an integer: ");
		int n = scan.nextInt();
		
		int i = 2;
		
		while(n % i != 0) {
			i++;
		}
		if(n==i) {
			System.out.println(n + "is a decimal number.");
		} else {
			System.out.println(n + "is not a decimal number.");
		}
		scan.close();

	}

}
