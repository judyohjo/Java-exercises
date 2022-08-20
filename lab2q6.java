public static int[][] generate2DArray(int numberOfRows, int numberOfColumns) {
	int[][] array = new int[numberOfRows][numberOfColumns];
	for(int i=0; i<array.length; i++) {
		for(int j=0; j<array[i].length; j++) {
			array[i][j] = i*j;
		}
	}
	return array;
}
