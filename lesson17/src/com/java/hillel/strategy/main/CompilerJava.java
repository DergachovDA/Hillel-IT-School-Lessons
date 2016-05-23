package com.java.hillel.strategy.main;

public class CompilerJava implements CompilerStrategy {
    @Override
    public void compile(String code) {
        System.out.println("Compiled in Java: " + code);
    }
}
