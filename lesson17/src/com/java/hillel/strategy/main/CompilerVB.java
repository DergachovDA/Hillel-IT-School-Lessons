package com.java.hillel.strategy.main;

public class CompilerVB implements CompilerStrategy {
    @Override
    public void compile(String code) {
        System.out.println("Compiled in VB: " + code);
    }
}
