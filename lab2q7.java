public static int[][] generateArray(int[] numbers) {
	int[] array1 = new int[numbers.length];
	for(int m=0; m<numbers.length; m++) {
		array1[m] = numbers[numbers.length-m-1];
	}
	int[][] array = new int[array1.length][];
	array[0] = new int[1];
	array[0][0] = array1[0];
	for(int i=1; i<array1.length; i++) {
		array[i] = new int[i+1];
		array[i][0] = array1[i];
		array[i][i] = array1[0];
		for(int j=1; j<i; j++) {
			array[i][j] = array[i-1][j-1];
		}
	}
	return array;
}
