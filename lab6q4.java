public void test(){
	Incrementer increment = new Incrementer() {
		public void increment() {
			int outer = Main.this.x;
			outer+=1;
			Main.this.x = outer;
			System.out.println(Main.this.x);
		}
	};
	increment.increment();
		    
}
