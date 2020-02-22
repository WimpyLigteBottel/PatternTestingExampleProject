package com.wimpy.patterns.factory.currencies;

import java.math.BigDecimal;

public class Rand extends Money {


    public Rand() {
        super();
        symbol = "R";
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public void setAmount(BigDecimal amount) {
        if (amount == null) {
            amount = BigDecimal.ZERO;
        }

        this.amount = amount;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
