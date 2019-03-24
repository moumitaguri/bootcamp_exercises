package com.step.bootcamp.pizza;

class Pizza {

    private final int basePrice;
    private Toppings toppings;


    Pizza() {
        this.basePrice = 50;
        this.toppings = new Toppings();
    }

    void add(Topping topping) {
        toppings.add(topping);
    }

    int calculateTotalPrice() {
        return this.basePrice + toppings.calculatePrice();
    }
}
