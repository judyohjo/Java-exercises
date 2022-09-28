class Container extends Shape {
    private ArrayList<Shape> elements = new ArrayList<Shape>();
    public Container(int newX, int newY, int newWidth, int newHeight, String newColor) {
        super(newX, newY, newWidth, newHeight, newColor);
    }
    public boolean add(Shape s) {
        boolean bool = false;
        if(super.rect.contains(s.rect)) {
            elements.add(s);
            bool = true;
            s.color = super.color;
        } else {
            bool = false;
        }
        return bool;
    }
    public void remove(Shape s) {
        elements.remove(s);
        super.color = "black";
    }
    public void draw(String indent) {
        int count = 0;
        count++;
        String space="";
        for(int i=0; i<count; i++) {
            space += " ";
        }
        System.out.println(space + super.toString());
        for(int i=0; i<elements.size(); i++) {
            System.out.println(space + " " + elements.get(i).toString());
        }
    }
}
