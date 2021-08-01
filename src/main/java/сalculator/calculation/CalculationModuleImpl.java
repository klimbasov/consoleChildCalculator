package сalculator.calculation;

public class CalculationModuleImpl implements CalculationModule{

    @Override
    public Float addition(Float firstOperand, Float secondOperand) {
        return new Float(firstOperand + secondOperand);
    }

    @Override
    public Float subtraction(Float firstOperand, Float secondOperand) {
        return new Float(firstOperand - secondOperand);
    }

    @Override
    public Float multiplication(Float firstOperand, Float secondOperand) {
        return new Float(firstOperand * secondOperand);
    }

    @Override
    public Float division(Float firstOperand, Float secondOperand) {
        return new Float(firstOperand / secondOperand);
    }

    @Override
    public Float raising(Float operand, Float power) {
        return new Float(Math.pow(operand, power));
    }
}
