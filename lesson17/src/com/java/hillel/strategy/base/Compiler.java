package com.java.hillel.strategy.base;

public class Compiler {


    private String language;

    public Compiler(String language) {
        this.language = language;
    }

    public void compiler(String code) {
        switch (language){
            case "C#":
                compileWithCSharp(code);
                break;
            case "Java":
                compileWithJava(code);
                break;
            case "C++":
                compileWithCTwoPlus(code);
                break;
        }
    }

    private void compileWithCSharp(String code) {
        System.out.println("Compiled in C#: " + code);
    }

    private void compileWithJava(String code) {
        System.out.println("Compiled in Java: " + code);
    }

    private void compileWithCTwoPlus(String code) {
        System.out.println("Compiled in C++: " + code);
    }

}
