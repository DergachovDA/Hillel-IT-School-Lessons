package ua.in.dergachovda.tests;

public class Calculator {

    public int add(int op1, int op2) {
        return op1 + op2;
    }

    public int subtract(int op1, int op2) {
        return op1 - op2;
    }

    public int divide(int op1, int op2) throws DivisionByZero {
        if (op2 == 0) {
            throw new DivisionByZero("You can't division by zero");
        }

        int result = op1 / op2;
        return result;
    }
}
