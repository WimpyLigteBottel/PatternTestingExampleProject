package com.wimpy.patterns.factory;

import com.wimpy.patterns.factory.currencies.Dollar;
import com.wimpy.patterns.factory.currencies.Euro;
import com.wimpy.patterns.factory.currencies.Money;
import com.wimpy.patterns.factory.currencies.Rand;

public class CurrencyFactory {

    private CurrencyFactory() {
    }

    public static Money build(String symbol) {

        switch (symbol) {
            case "R":
                return new Rand();
            case "$":
                return new Dollar();
            case "E":
                return new Euro();
            default:
                throw new IllegalArgumentException("Unknown symbol[symbol=" + symbol + "]");
        }

    }


    public static Money build(Money currentCurrency, String toSymbol) {

        Money money = build(toSymbol);




        return money;
    }


}
