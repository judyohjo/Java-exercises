public static int[] getLargerThan(int[] numbers, int m) {
	int count = 0;
	int total = 0;
	for(int i=0; i<numbers.length; i++) {
		if(numbers[i] > m) {
			total += 1;

		}
	}
	int[] array = new int[total];
	for(int j=0; j<numbers.length; j++) {
		if(numbers[j] > m) {
			array[count] = numbers[j];
			count++;
		}
	}
	return array;
		
}
