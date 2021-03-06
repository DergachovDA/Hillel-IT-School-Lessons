package com.java.patterns.builder;
//JavaBean pattern
public class CheescakeBean {

    private String name;
    private int weight;
    private int fat;
    private int carbohydrate;
    private int protein;
    private String vitamins;

    public CheescakeBean() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setVitamins(String vitamins) {
        this.vitamins = vitamins;
    }
}
