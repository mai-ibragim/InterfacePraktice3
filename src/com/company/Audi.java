package com.company;

public class Audi extends Auto{
    public Audi(int price, int weight) {
        super(price, weight);
    }

    @Override
    public void speed() {
        System.out.println("Audi rides fast.");

    }

    @Override
    public void info() {
        super.info();
    }
}
