public static int[] getIncreasedDecreased(int[] numbers) {
	int[] array = new int[numbers.length];
	int count = 0;
	for(int i=0; i<numbers.length; i++) {
		if(numbers[i] < 100) {
			array[count] = numbers[i] * 10;
		} else {
			array[count] = numbers[i] / 10;
		} count++;
	} return array;
} 
