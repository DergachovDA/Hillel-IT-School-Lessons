package less12.classwork.calculator;

public class Adder extends BaseCalculator {

    Adder(int op1, int op2) {
        this.operand1 = op1;
        this.operand2 = op2;
    }

    int calculate() {
        return operand1 + operand2;
    }

    public String toString() {
        return "Add:\t\t";
    }
}
