package service;

import model.ComplexNumber;
import model.ComplexOperation;

public class CalculatorService {
    private ComplexOperation operation;

    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        if (operation == null) {
            throw new IllegalStateException("Operation not set");
        }
        ComplexNumber result = operation.execute(a, b);
        // Logger.getInstance().log("Calculated: " + result);
        System.out.println("Calculated: " + result);
        return result;
    }
}