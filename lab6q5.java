public static void SortByAgeExample(ArrayList<Person> myList) {
    Comparator<Person> person = new Comparator<Person>() {
        public int compare(Person p1, Person p2) {
            int count=0;
	        if(p1.age < p2.age) {
	            count = (p1.age - p2.age);
	        } else if(p1.age == p2.age) {
	            count = 0;
	        } else if(p1.age > p2.age){
	            count = (p1.age - p2.age);
	        }
	    return count;
        }
    };
    Collections.sort(myList, person);
    System.out.println(myList);
}
