public static int[] remove_element_at2(int[] values) {
	int[] array = new int[values.length-1];
	int count = 0;
	for(int i=0; i<values.length; i++) {
		if(i != 2) {
			array[count] = values[i];
			count++;
		}
	}
	return array;
}
