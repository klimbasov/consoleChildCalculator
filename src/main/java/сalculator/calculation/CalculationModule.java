package сalculator.calculation;

public interface CalculationModule {
    Float addition(Float firstOperand, Float secondOperand);

    Float subtraction(Float firstOperand, Float secondOperand);

    Float multiplication(Float firstOperand, Float secondOperand);

    Float division(Float firstOperand, Float secondOperand);

    Float raising(Float operand, Float power);
}
