class Person implements Cloneable {
    private String firstname; 
    private String surname; 
    public Person(String f, String s) {
        firstname = f;
        surname = s;
    }
    public String toString() { return firstname + " " + surname; }
    public Person clone() {
        Person copyPerson = new Person(this.firstname, this.surname);
        return copyPerson;
    }
    public boolean equals(Person p) {
        boolean bool;
        if((p.firstname == this.firstname) && (p.surname == this.surname)) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
 }
