package calculator;

public class Divider extends BaseCalculator {

    Divider(int op1, int op2) {
        this.operand1 = op1;
        this.operand2 = op2;
    }

    int calculate() {
        return operand1 / operand2;
    }

    public String toString() {
        return "Divide:\t\t";
    }
}
