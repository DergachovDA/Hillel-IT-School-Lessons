package com.java.hillel.strategy.main;

public class CompilerCTwoPlus implements CompilerStrategy {
    @Override
    public void compile(String code) {
        System.out.println("Compiled in C++: " + code);
    }
}
