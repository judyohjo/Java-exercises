class BulkDiscount extends BaseDiscount {
    
    private int minimumQuantity;
    
    public BulkDiscount(int quantity, double percent) {
        super(percent);
        minimumQuantity = quantity;
    }
    
    public double getDiscount(int numberOfItems, double itemCost) {
        double num;
        if(numberOfItems > minimumQuantity) {
            num = ((super.percentOff * numberOfItems * itemCost)/100.0);
        } else {
            num = 0.0;
        }
        return num;
        
    }
}
