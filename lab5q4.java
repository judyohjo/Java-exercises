class VIPDiscount extends BaseDiscount {
    
    private double minimumAmount;
    
    public VIPDiscount(int quantity, double percent) {
        super(percent);
        minimumAmount = quantity;
    }
    
    public double getDiscount(int numberOfItems, double itemCost) {
        double num;
        if((numberOfItems * itemCost) >= minimumAmount) {
            num = ((super.percentOff * numberOfItems * itemCost)/100.0);
        } else {
            num = 0.0;
        }
        return num;
        
    }
}
