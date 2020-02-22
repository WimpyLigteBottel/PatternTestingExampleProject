package com.wimpy.patterns.factory.currencies;

import java.math.BigDecimal;

public abstract class Money {

    protected BigDecimal amount;
    protected String symbol;

    public Money() {
        this.amount = BigDecimal.ZERO;
    }

    public abstract BigDecimal getAmount();

    public abstract void setAmount(BigDecimal amount);

    public abstract String getSymbol();
}
