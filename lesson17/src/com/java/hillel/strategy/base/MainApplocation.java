package com.java.hillel.strategy.base;

public class MainApplocation {

    public static void main(String[] args) {
        Compiler compiler = new Compiler("C++");
        compiler.compiler("Some code");
    }
}
