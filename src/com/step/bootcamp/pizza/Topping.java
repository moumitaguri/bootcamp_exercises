package com.step.bootcamp.pizza;

public enum Topping {
    CHICKEN(30),
    JALAPENO(40),
    EXTRA_CHEESE(25),
    VEGETABLE(20),
    MOZZARELLA(10),
    TOMATO_SAUCE(5);

    private int price;

    Topping(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
