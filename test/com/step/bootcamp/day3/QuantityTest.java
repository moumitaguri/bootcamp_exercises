package com.step.bootcamp.day3;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class QuantityTest {

    @Test
    void shouldCompareTwoSameQuantities() {
        Quantity twelveInches = new Quantity(new BigDecimal(12), Unit.INCH);
        Quantity oneFeet = new Quantity(BigDecimal.ONE, Unit.FEET);

        assertEquals(twelveInches, oneFeet);
    }

    @Test
    void shouldNotCompareTwoDifferentQuantities() {
        Quantity thirteenInches = new Quantity(new BigDecimal(13), Unit.INCH);
        Quantity oneFeet = new Quantity(BigDecimal.ONE, Unit.FEET);

        assertFalse(thirteenInches.equals(oneFeet));
    }
}