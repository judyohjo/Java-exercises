import java.util.Scanner;

public class Lab00Q04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		for (int i=0; i<num; i++) {
			System.out.print("X");
		}
	}
}
