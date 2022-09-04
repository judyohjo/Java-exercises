public class SubtractOperation extends BaseOperation {
    protected int operandA;
    protected int operandB;
    
    public SubtractOperation(int x, int y) {
        super(x,y);
    }
   
    public int execute() {
        return (super.operandA - super.operandB);
    }
}
