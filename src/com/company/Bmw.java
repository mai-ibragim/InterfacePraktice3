package com.company;

public class Bmw extends Auto{

    public Bmw(int price, int weight) {
        super(price, weight);
    }

    @Override
    public void speed() {
        System.out.println("BMW rides faster than Audi");

    }

    @Override
    public void info() {
        super.info();
    }
}
