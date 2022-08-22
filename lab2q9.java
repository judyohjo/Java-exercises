public static boolean noEvens(int[] values) {
	boolean bool = true;
	if(values.length == 0) {
		bool = true;
	} else {
		for(int i=0; i<values.length; i++) {
			if(values[i] % 2 == 0) {
				bool = false;
				break;
			} else if(values[i] == 1 || values[i] % 2 != 1) {
				bool = true;
			}
		}
	}
	return bool;
}
