class NumberIterator implements Iterator<Integer> {
    private int nextValue=0;
    public boolean hasNext() {
        return nextValue < maxValue; 
    }
    public Integer next() {
        int num = 0;
        if(this.hasNext()) {
            num = nextValue;
            nextValue++;
        }
        return num;
    }
    public void removes() {
        throw new UnsupportedOperationException();
    }
}
