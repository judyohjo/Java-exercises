class Inner {
    private int x;
    public Inner(int newX) {
        this.x = newX;
    }
    public int getX() {
        return this.x;
    }
    public void increment() {
        int outer = MyMain.this.x;
        outer+=2;
        this.x+=1;
        MyMain.this.x = outer;
    }
}
