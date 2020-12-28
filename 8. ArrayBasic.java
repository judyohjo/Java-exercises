import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		//1. Declaration of Arrays - using Stack
//		int score[]; (O) // C style
//		int score[5];(X) // This is not allowed in Java
		int[] score;     //JAVA Style
		
		//2. Creating Arrays - using Heap
		score = new int[5];
		System.out.println(score);

		//3. Initialisation of Arrays - storing values
		score[0] = 87;
		score[2] = 99;
		score[3] = score[0];
		
		//4. Referencing values in Array
		System.out.println("Value in Array(3): " + score[2]);
		System.out.println("Value in Array(4): " + score[3]);
		System.out.println("Value in Array(5):" + score[4]);
		
		
		System.out.println(Arrays.toString(score));
		
		// Use ArrayName.length to see the length of the array
		System.out.println("Array length: " + score.length);
		
		//Method to do 'Declaration of Array' and 'Creating Array' simultaneously (1. and 2. at the same time)
		byte[] bArr = new byte[7];
		
		//Method to do 'Initialisation of Arrays' and 'Referencing values in Array' simultaneously (3. and 4. at the same time)
		char[] letters = new char[] {'A', 'B', 'C', 'D'};
		System.out.println(Arrays.toString(letters));
		
		String[] names = {"Judy", "Emily", "Clara"};
		System.out.println(Arrays.toString(names));
		 
		System.out.println(Arrays.toString(bArr));
		
	}

}
