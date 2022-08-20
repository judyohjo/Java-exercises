public static double[] convert_scores(double[] numbers, int outOf) {
	int count = 0;
	for(int i=0; i<numbers.length; i++) {
		double num = (numbers[i] / outOf)*100;
		double result = Math.round(num * 10.0) / 10.0;
		numbers[count] = result;
		count++;
	} 
	return numbers;
		
}
