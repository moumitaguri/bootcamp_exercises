package com.step.bootcamp.day3;

import java.math.BigDecimal;

class Unit {
    static final Unit FEET = new Unit(new BigDecimal(12));
    static final Unit INCH = new Unit(new BigDecimal(1));
    private final BigDecimal ratio;


    private Unit(BigDecimal ratio) {
        this.ratio = ratio;
    }

    BigDecimal valueInBaseUnit(BigDecimal value) {
        return value.multiply(this.ratio);
    }
}
