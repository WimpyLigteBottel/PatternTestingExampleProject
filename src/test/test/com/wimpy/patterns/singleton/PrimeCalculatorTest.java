package com.wimpy.patterns.singleton;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrimeCalculatorTest {

    private PrimeCalculator primeCalculator;

    @Before
    public void setup() {
        primeCalculator = new PrimeCalculator(10_000);
    }

    @Test
    public void nThPrimeNumber_expectPrimeToBeCorrect() {
        assertEquals(BigInteger.valueOf(2), primeCalculator.nThPrimeNumber(1));
        assertEquals(BigInteger.valueOf(3), primeCalculator.nThPrimeNumber(2));
        assertEquals(BigInteger.valueOf(5), primeCalculator.nThPrimeNumber(3));
        assertEquals(BigInteger.valueOf(104729), primeCalculator.nThPrimeNumber(10_000));
    }

    @Test
    public void nThPrimeNumberPreConstructedNumber_expectPrimeToBeCorrect() {
        assertEquals(BigInteger.valueOf(2), primeCalculator.nThPrimeNumberPreConstructedNumber(1));
        assertEquals(BigInteger.valueOf(3), primeCalculator.nThPrimeNumberPreConstructedNumber(2));
        assertEquals(BigInteger.valueOf(5), primeCalculator.nThPrimeNumberPreConstructedNumber(3));
        assertEquals(BigInteger.valueOf(104729), primeCalculator.nThPrimeNumberPreConstructedNumber(10_000));
    }


    @Test
    public void bothMethods_expectToBeEqual() {

        for (int i = 0; i < 100; i++) {
            assertEquals(primeCalculator.nThPrimeNumber(i), primeCalculator.nThPrimeNumberPreConstructedNumber(i));
        }
    }

    @Test
    public void preConstructedShouldBeFaster_expectToBeEqual() {
        Instant before = Instant.now();
        assertEquals(BigInteger.valueOf(104729), primeCalculator.nThPrimeNumber(10_000));
        long nonPreConstructed = Duration.between(before, Instant.now()).toMillis();


        Instant preConstructed = Instant.now();
        assertEquals(BigInteger.valueOf(104729), primeCalculator.nThPrimeNumberPreConstructedNumber(10_000));
        long preConstructedTime = Duration.between(preConstructed, Instant.now()).toMillis();

        System.out.println("preConstructedTime = " + preConstructedTime);
        System.out.println("nonPreConstructed = " + nonPreConstructed);
        assertTrue(nonPreConstructed > preConstructedTime);

    }
}