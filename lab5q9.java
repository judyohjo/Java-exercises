class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    
    public MovablePoint(int newX, int newY, int newXSpeed, int newYSpeed) {
        x = newX;
        y = newY;
        xSpeed = newXSpeed;
        ySpeed = newYSpeed;
    }
    
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
    
    public void moveUp() {
        y = y - ySpeed;
        
    }
    public void moveDown() {
        y = y + ySpeed;
        
    }
    public void moveLeft() {
        x = x - xSpeed;
        
    }
    public void moveRight() {
        x = x + xSpeed;
        
    }
}
