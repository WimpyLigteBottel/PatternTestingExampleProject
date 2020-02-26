package com.wimpy.patterns.factory;

import com.wimpy.patterns.factory.currencies.Dollar;
import com.wimpy.patterns.factory.currencies.Euro;
import com.wimpy.patterns.factory.currencies.Rand;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CurrencyFactoryTest {


    @Test
    public void build_withSymbolOnly_expectCorrectReturnedClass() {
        assertTrue(ImportantPersonFactory.build("R") instanceof Rand);
        assertTrue(ImportantPersonFactory.build("E") instanceof Euro);
        assertTrue(ImportantPersonFactory.build("$") instanceof Dollar);

    }

    @Test(expected = IllegalArgumentException.class)
    public void build_withWrongDollarSymbol_expectException() {
        ImportantPersonFactory.build("Dollar");
    }

    @Test(expected = IllegalArgumentException.class)
    public void build_withWrongDollarSymbol2_expectException() {
        ImportantPersonFactory.build("DOLLAR");
    }

    @Test(expected = IllegalArgumentException.class)
    public void build_withWrongDollarSymbol3_expectException() {
        ImportantPersonFactory.build("$$$$$$$$$");
    }

    @Test
    public void build_withAmount() {
    }
}