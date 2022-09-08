class MovableRectangle implements Movable {
    
    private MovablePoint topLeft;
    
    public MovableRectangle(int newX, int newY, int newXSpeed, int newYSpeed) {
        this.topLeft = new MovablePoint(newX, newY, newXSpeed, newYSpeed);
    }
    
    public String toString() {
        return topLeft.toString();
    }
    
    public void moveUp() {
        this.topLeft.y = this.topLeft.y - this.topLeft.ySpeed;
        
    }
    public void moveDown() {
        this.topLeft.y = this.topLeft.y + this.topLeft.ySpeed;
        
    }
    public void moveLeft() {
        this.topLeft.x = this.topLeft.x - this.topLeft.xSpeed;
        
    }
    public void moveRight() {
        this.topLeft.x = this.topLeft.x + this.topLeft.xSpeed;
        
    }
}
