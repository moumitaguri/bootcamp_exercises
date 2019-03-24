package com.step.bootcamp.units;

import java.math.BigDecimal;

class Unit {

    private static Object LENGTH = new Object();
    private static Object VOLUME = new Object();

    static final Unit LITRE = new Unit(BigDecimal.ONE, VOLUME);
    static final Unit GALLON= new Unit(new BigDecimal(3.78), VOLUME);

    static final Unit CM = new Unit(new BigDecimal(0.4), LENGTH);
    static final Unit MM = new Unit(new BigDecimal(0.04), LENGTH);
    static final Unit FEET = new Unit(new BigDecimal(12), LENGTH);
    static final Unit INCH = new Unit(BigDecimal.ONE, LENGTH);

    private final BigDecimal ratio;
    private final Object type;

    private Unit(BigDecimal ratio, Object type) {
        this.ratio = ratio;
        this.type = type;
    }

    BigDecimal valueInBaseUnit(BigDecimal value) {
        return value.multiply(this.ratio);
    }

    boolean isOfSameType(Unit anotherUnit){
        return this.type.equals(anotherUnit.type);
    }
}
