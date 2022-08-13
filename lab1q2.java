import java.util.Scanner;

import java.lang.*;
public class NumberOfLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String phrase = input.nextLine();
		
		
		String lowerphrase = phrase.toLowerCase();
		
		int letters=0;
		int digits=0;
		
		for(int i=0; i<lowerphrase.length(); i++) {
			char c = lowerphrase.charAt(i);
			if(Character.isLetter(c)) {
				letters++;
			} else if(Character.isDigit(c)) {
				digits++;
			}
		}
	
		System.out.printf("The number of letters is %d and the number of digits is %d.", letters, digits);
	}
}
