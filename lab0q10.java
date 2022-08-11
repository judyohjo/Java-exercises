import java.util.Scanner;

public class Lab00Pizza {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many people in the group? ");
		int person = input.nextInt();
		System.out.println("How much was the Pizzas in total? ");
		double total = input.nextDouble();
		
		int money = (int) Math.round(total/person);
		
		System.out.printf("Each person pays $%d.", money);
	}
}
