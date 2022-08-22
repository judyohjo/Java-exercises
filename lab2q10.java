public static ArrayList<Integer> getMultiple(int[] numbers, int m) {
	ArrayList<Integer> array = new ArrayList<Integer> (numbers.length);
	for(int i=0; i<numbers.length; i++) {
		if(numbers[i] % m == 0) {
			array.add(numbers[i]);
		} else {
			continue;
		}
	}
	return array;
}
