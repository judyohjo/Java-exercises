
public class CastingExample1 {

	public static void main(String[] args) {
		
		
		byte b = 10;
		int i = b; // byte -> int 
		
		char c = 'a';
		int j = c; // char -> int conversion because c = 2 bytes and j = 4 bytes
		System.out.println("Unicode of a: " + j);
		
		int k = 500;
		double d = k; // int -> double conversion (int can go inside double)
		System.out.println(d);

	}

}
