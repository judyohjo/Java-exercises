
public class ConditionalExample {

	public static void main(String[] args) {
		
		int r = 5 - (int)(Math.random() * 10);
		System.out.println("Random value: " + r );
		
		int abs = (r >= 0) ? r: -r;
		System.out.println(r + "'s absolute value: " + abs);

	}

}
