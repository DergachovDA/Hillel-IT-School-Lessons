package com.java.patterns.builder;

public class Main {

    public static void main(String[] args) {
        CheesecakeTelescopic cheesecakeTelescopic = new CheesecakeTelescopic("Lemon cheese", 100);

        CheescakeBean cheescakeBean = new CheescakeBean();
        cheescakeBean.setName("Lemon cheese");
        cheescakeBean.setWeight(100);

        Cheesecake cheese = new Cheesecake.Builder("Lemon chesse", 100)
                .fat(5)
                .protein(3)
                .vitamins("A,B,C")
                .build();
    }

}
