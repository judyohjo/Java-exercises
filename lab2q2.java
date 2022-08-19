public static int get_sum_squares(int[] numbers) {
	int[] array = new int[numbers.length];
	int count = 0;
	int total = 0;
	for(int i=0; i<numbers.length; i++) {
		array[count] = (numbers[i] * numbers[i]);
		count++;
	}
	for(int j=0; j<array.length; j++) {
		total += array[j];
	}
	return total;
}
