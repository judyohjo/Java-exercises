
public class ForExample2 {

	public static void main(String[] args) {
		
		//7~100까지의 정수 중 7의 배수를 모두 가로로 출력
		for(int i=7; i<=100; i+=7) {
//			System.out.println(i + " "); //둘다 맞음
			System.out.printf("%d ", i);
		}
		System.out.println("\n---------------------------");

		//1~100까지의 정수 중 6의 배수를 모두 가로로 출력
		for(int i=1; i<=100; i++) {
			if(i % 6 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n---------------------------");
	
		//1~100까지의 정수 중 8의 배수이면서 동시에 
		//16의 배수가 아닌 수를 모두 가로로 출력.
		for(int i=1; i<=100; i++) {
			if(i % 8 == 0 && i % 16 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n---------------------------");

	
		//1~850까지의 정수 중 9의 배수의 개수를 출력하세요. 
		int count = 0;
		for(int i=1; i<=850; i++) {
			if(i % 9 == 0) {
				count++;
			}
		}
		System.out.println("9의 배수의 개수: " + count + "개");
	}
}
