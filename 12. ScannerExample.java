import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert your name.");
		System.out.print("> ");
		String name = scan.next();
		
		System.out.println("Insert your age.");
		System.out.print("> ");
		int age = scan.nextInt();
		System.out.println("--------------------");
		
		System.out.println("Your name is " + name + "and you are " + age + "years old.");
		
		scan.close();
	}

}
