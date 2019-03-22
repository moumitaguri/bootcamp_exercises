package com.step.bootcamp.day3;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

        assertNotEquals(thirteenInches, oneFeet);
    }

    @Test
    void shouldCompareOneCmToEquivalentInches() {
        Quantity pointFourInch = new Quantity(new BigDecimal(0.4), Unit.INCH);
        Quantity oneCM = new Quantity(BigDecimal.ONE, Unit.CM);

        assertEquals(oneCM, pointFourInch);
    }

    @Test
    void shouldCompareTwoInchesAndFiveCm() {
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity fiveCM = new Quantity(new BigDecimal(5), Unit.CM);

        assertEquals(twoInches, fiveCM);
    }

    @Test
    void shouldCompareOneFeetAndThirtyCMAsEqual() {
        Quantity oneFeet = new Quantity(BigDecimal.ONE, Unit.FEET);
        Quantity thirtyCM = new Quantity(new BigDecimal(30), Unit.CM);

        assertEquals(oneFeet, thirtyCM);
    }

    @Test
    void shouldCompareOneCMAndTenMMAsEqual() {
        Quantity oneCM = new Quantity(BigDecimal.ONE, Unit.CM);
        Quantity tenMM = new Quantity(new BigDecimal(10), Unit.MM);

        assertEquals(oneCM, tenMM);
    }

    @Test
    void shouldCompareOneGallonAndEquivalentLitresAsEqual() {
        Quantity oneGallon = new Quantity(BigDecimal.ONE, Unit.GALLON);
        Quantity threePointSevenEightLitres = new Quantity(new BigDecimal(3.78), Unit.LITRE);

        assertEquals(oneGallon,threePointSevenEightLitres);
    }

    @Test
    void shouldNotCompareTwoDifferentTypeOfQuantities() {
        Quantity oneInch = new Quantity(BigDecimal.ONE, Unit.INCH);
        Quantity oneLitre = new Quantity(BigDecimal.ONE, Unit.LITRE);

        assertNotEquals(oneInch,oneLitre);
    }
}