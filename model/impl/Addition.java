package model.impl;

import model.ComplexNumber;
import model.ComplexOperation;

public class Addition implements ComplexOperation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }
}




