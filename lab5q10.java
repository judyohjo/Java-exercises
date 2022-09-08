class MovableCircle implements Movable {
    
    private MovablePoint centre;
    
    public MovableCircle(int newX, int newY, int newXSpeed, int newYSpeed) {
        this.centre = new MovablePoint(newX, newY, newXSpeed, newYSpeed);
    }
    
    public String toString() {
        return centre.toString();
    }
    
    public void moveUp() {
        this.centre.y = this.centre.y - this.centre.ySpeed;
        
    }
    public void moveDown() {
        this.centre.y = this.centre.y + this.centre.ySpeed;
        
    }
    public void moveLeft() {
        this.centre.x = this.centre.x - this.centre.xSpeed;
        
    }
    public void moveRight() {
        this.centre.x = this.centre.x + this.centre.xSpeed;
        
    }
}
