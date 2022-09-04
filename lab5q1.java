public class AddOperation extends BaseOperation {
    protected int operandA;
    protected int operandB;
    
    public AddOperation(int x, int y) {
        super(x,y);
    }
   
    public int execute() {
        return (super.operandA + super.operandB);
    }
}
