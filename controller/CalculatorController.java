package controller;

import model.ComplexNumber;
import model.ComplexOperation;
import service.CalculatorService;

public class CalculatorController {
    private CalculatorService service = new CalculatorService();

    public void setOperation(ComplexOperation operation) {
        service.setOperation(operation);
    }
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        return service.calculate(a, b);
    }
}
