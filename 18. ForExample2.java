
public class ForExample2 {

	public static void main(String[] args) {
		
		for(int i=7; i<=100; i+=7) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n---------------------------");

		for(int i=1; i<=100; i++) {
			if(i % 6 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n---------------------------");
	
		for(int i=1; i<=100; i++) {
			if(i % 8 == 0 && i % 16 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n---------------------------");

		int count = 0;
		for(int i=1; i<=850; i++) {
			if(i % 9 == 0) {
				count++;
			}
		}
		System.out.println("Total count for multiple of 9: " + count);
	}
}
