package com.company;

public abstract class Auto {
    private int price;
    private int weight;

    public Auto(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public abstract void speed();

    public void info() {
        System.out.println(getPrice() + " " + getWeight());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
