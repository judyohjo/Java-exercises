class MyClass {
    private String outerName;
    public MyClass(String newName) {
        this.outerName = newName;
    }
    public String getOuterName() {
        return this.outerName;
    }
    public void start() {
        MyInner inner = new MyInner();
        inner.printValues(); 
    }
    public class MyInner {
        private String innerName;
        public MyInner() {
            innerName = outerName.toUpperCase();
            outerName = outerName;
        }
        public String getInnerName() {
            return innerName; 
        }
        public void printValues() {
            System.out.printf("outer:%s, inner:%s\n", outerName, innerName);
        }
    }
}
