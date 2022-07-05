package com.company;

public class Main {

    public static void main(String[] args) {
        Bmw bmw = new Bmw(29000, 5800);
        bmw.info();
        bmw.speed();

        Audi audi = new Audi(47000, 7400);
        audi.info();
        audi.speed();
    }
}
