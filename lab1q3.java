import java.util.Scanner;

public class ConvertToOppositeCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("");
		String str1 = input.nextLine();
		
		String new_string = "";
		
		for(int i=0; i<str1.length(); i++) {
			char c = str1.charAt(i);
			if(Character.isLowerCase(c)) {
				int c2 = c;
				int c3 = c2 - 32;
				char new_c = (char) c3;
				new_string += new_c;
			} else if(Character.isUpperCase(c)){
				int c4 = c;
				int c5 = c4 + 32;
				char new_c2 = (char) c5;
				new_string += new_c2;
			} else {
				new_string += c;
			}
			if(str1.length() == new_string.length()) {
				System.out.println("Enter a sentence: ");
				System.out.printf("%s", new_string);
			}
			
		}
		
	}
	
}
