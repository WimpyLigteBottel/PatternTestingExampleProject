package com.wimpy.patterns.singleton;

import java.math.BigInteger;

public class PrimeCalculator {

    private final PrimeNumberModel primeNumberModel;

    public PrimeCalculator(int number) {
        primeNumberModel = new PrimeNumberModel(number);
    }

    public BigInteger nThPrimeNumber(int number) {


        BigInteger bigInteger = BigInteger.ONE;
        for (int i = 0; i < number; i++) {
            bigInteger = bigInteger.nextProbablePrime();
        }

        return bigInteger;
    }


    public BigInteger nThPrimeNumberPreConstructedNumber(int nth) {

        return primeNumberModel.getPrimeNumberList().get(nth);
    }


}
