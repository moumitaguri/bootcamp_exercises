package com.step.bootcamp.pizza;

import java.util.ArrayList;
import java.util.List;

class Toppings {

    private List<Topping> toppings = new ArrayList<>();


    int calculatePrice() {
        int totalPrice = 0;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }

    void add(Topping topping) {
        toppings.add(topping);
    }
}
