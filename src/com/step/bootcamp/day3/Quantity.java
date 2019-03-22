package com.step.bootcamp.day3;

import java.math.BigDecimal;

class Quantity {

    private BigDecimal value;
    private Unit unit;

    Quantity(BigDecimal value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object otherQuantity) {

        if (this == otherQuantity) return true;
        if (otherQuantity == null || getClass() != otherQuantity.getClass()) return false;
        Quantity quantity = (Quantity) otherQuantity;

        BigDecimal selfBaseValue = this.unit.valueInBaseUnit(this.value);
        BigDecimal otherQuantityBaseValue = quantity.unit.valueInBaseUnit(quantity.value);

        return selfBaseValue.intValue() == otherQuantityBaseValue.intValue();
    }

}
