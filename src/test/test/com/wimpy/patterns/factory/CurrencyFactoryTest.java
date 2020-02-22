package com.wimpy.patterns.factory;

import com.wimpy.patterns.factory.currencies.Dollar;
import com.wimpy.patterns.factory.currencies.Euro;
import com.wimpy.patterns.factory.currencies.Rand;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CurrencyFactoryTest {


    @Test
    public void build_withSymbolOnly_expectCorrectReturnedClass() {
        assertTrue(CurrencyFactory.build("R") instanceof Rand);
        assertTrue(CurrencyFactory.build("E") instanceof Euro);
        assertTrue(CurrencyFactory.build("$") instanceof Dollar);

    }

    @Test(expected = IllegalArgumentException.class)
    public void build_withWrongDollarSymbol_expectException() {
        CurrencyFactory.build("Dollar");
    }

    @Test(expected = IllegalArgumentException.class)
    public void build_withWrongDollarSymbol2_expectException() {
        CurrencyFactory.build("DOLLAR");
    }

    @Test(expected = IllegalArgumentException.class)
    public void build_withWrongDollarSymbol3_expectException() {
        CurrencyFactory.build("$$$$$$$$$");
    }

    @Test
    public void build_withAmount() {
    }
}