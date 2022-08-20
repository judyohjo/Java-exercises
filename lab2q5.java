public static void rotate_numbers(int[] numbers) {
	int count = 1;
	int total = 0;
	int[] array = new int[numbers.length];
	for(int i=0; i<numbers.length; i++) {
		if(i == numbers.length-1) {
			array[0] = numbers[i];
		} else {
			array[count] = numbers[i];
			count++;
		}
	}
	for(int j=0; j<array.length; j++) {
		numbers[total] = array[j];
		total++;
	}
}
