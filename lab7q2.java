class Circle extends Shape {
    public Circle(int newX, int newY, int newWidth, int newHeight, String newColor) {
        super(newX, newY, newWidth, newHeight, newColor);
    }
    public void draw(String indent) {
        int count = 0;
        count++;
        String space="";
        for(int i=0; i<count; i++) {
            space += " ";
        }
        System.out.println(space + super.toString());
    }
}
