
public class CastingOperator {

	public static void main(String[] args) {
		
		char c = 'B';
		int i = 2;
		
		char cc = (char)(c + i);
		int ii = c + i; //same thing as above
		System.out.println(cc);
		System.out.println(ii);
		
		int j = 10;
		double d = j / 4;
		System.out.println(d); // this will give 2.0
		
		int z = 10;
		double y = z / 4.0;
		System.out.println(y); // this will give 2.5
		
		int n = 10;
		double m = (double)(n / 4);
		System.out.println(m); // this will give 2.0
		
		int t = 10;
		double g = (double)t / 4;
		System.out.println(g); // this will give 2.5
		
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2); // need to add (byte) because byte + byte = int
		System.out.println(b3);
	}

}
