import java.util.Scanner;

import java.util.regex.*;
public class IPAddress {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("");
		String new_string = input.next();
		
		String[] new_split = new_string.split("\\.");
		
		System.out.println("Enter an IP address: ");
		System.out.printf("Network ID: %s, %s and %s\n", new_split[0], new_split[1], new_split[2]);
		System.out.printf("Host ID: %s", new_split[3]);
			
	}
}
