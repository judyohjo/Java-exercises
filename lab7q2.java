abstract class Shape {
    protected Rectangle rect = new Rectangle();
    protected String color;
    public Shape(int newX, int newY, int newWidth, int newHeight, String newColor) {
        rect.x = newX;
        rect.y = newY;
        rect.width = newWidth;
        rect.height = newHeight;
        color = newColor;
    }
    public Rectangle getRectangle() {
        return rect;
    }
    public String getColor() {
        return color;
    }
    public void setRectangle(int newX, int newY, int newWidth, int newHeight) {
        rect.x = newX;
        rect.y = newY;
        rect.width = newWidth;
        rect.height = newHeight;
    }
    public void setRectangle(Rectangle r) {
        rect.x = r.x;
        rect.y = r.y;
        rect.width = r.width;
        rect.height = r.height;
    }
    public void setColor(String newColor) {
        color = newColor;
    }
    public String toString() {
        return String.format("(%d,%d) %s", rect.x, rect.y, color);
    }
    abstract void draw(String indent);
}
