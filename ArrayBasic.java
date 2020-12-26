import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		//1. 배열의 선언 - stack에 배열변수를 설정.
//		int score[]; (O) // C style
//		int score[5];(X) // 자바에서는 선언시 크기 명시 불가.
		int[] score;     //JAVA Style
		
		//2. 배열의 생성 - Heap에 실제 데이터가 저장될 공간을 생성.
		//배열은 생성시 크기를 명시함. 한번 설정한 크기는 변경 불가.
		score = new int[5];
		System.out.println(score);

		//3. 배열의 초기화 - 배열에 값을 저장하는 과정
		score[0] = 87;
		score[2] = 99;
		score[3] = score[0];
		
		//4. 배열의 앖 참조(사용)
		System.out.println("배열의 3번째 데이터값: " + score[2]);
		System.out.println("배열의 4번째 데이터값: " + score[3]);
		System.out.println("배열의 5번째 데이터값: " + score[4]);
		
		
		System.out.println(Arrays.toString(score));
		
		//배열의 길이를 알아보려면 배열변수명.length 명령을 사용.
		System.out.println("배열의 길이: " + score.length);
		
		//베열의 선언과 생성을 동시에 하는 방범.
		byte[] bArr = new byte[7];
		
		//베열의 선언과 생성과 초기화를 동시에 하는 방법.
		char[] letters = new char[] {'가', '나', '다', '라'};
		System.out.println(Arrays.toString(letters));
		
		String[] names = {"홍길동", "신사임당", "강감찬"};
		System.out.println(Arrays.toString(names));
		
		//배열의 초기값을 설정하지 않으면 각 데이터타입의 
		//기본값으로 자동초기화됩니다. 
		System.out.println(Arrays.toString(bArr));
		
	}

}
