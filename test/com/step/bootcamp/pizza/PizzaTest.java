package com.step.bootcamp.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {

    @Test
    void shouldReturnTheBasePriceWhenNoToppingIsAdded() {

        Pizza pizza = new Pizza();
        assertEquals(50, pizza.calculateTotalPrice());
    }

    @Test
    void shouldCalculateTotalPriceAfterAddingOneTopping() {

        Pizza pizza = new Pizza();
        pizza.add(Topping.CHICKEN);
        assertEquals(80, pizza.calculateTotalPrice());
    }

    @Test
    void shouldCalculateTotalPriceAfterAddingMultipleToppings() {

        Pizza pizza = new Pizza();
        pizza.add(Topping.CHICKEN);
        pizza.add(Topping.CHICKEN);
        pizza.add(Topping.JALAPENO);
        pizza.add(Topping.EXTRA_CHEESE);
        
        assertEquals(175, pizza.calculateTotalPrice());
    }
}
