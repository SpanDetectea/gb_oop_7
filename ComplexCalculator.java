import model.ComplexNumber;
import model.ComplexOperation;

public class ComplexCalculator {
    private ComplexOperation operation;

    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        if (operation == null) {
            throw new IllegalStateException("Operation not set");
        }
        ComplexNumber result = operation.execute(a, b);
        return result;
    }
}
