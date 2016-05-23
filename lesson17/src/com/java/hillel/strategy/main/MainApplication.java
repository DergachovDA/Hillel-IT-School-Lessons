package com.java.hillel.strategy.main;

public class MainApplication {

    public static void main(String[] args) {

        Compiler compiler = new Compiler(new CompilerVB());

//        CompilerStrategy strategy = new CompilerCSharp();
//        compiler.setStrategy(strategy);

        compiler.compile("Some code");
    }

}
