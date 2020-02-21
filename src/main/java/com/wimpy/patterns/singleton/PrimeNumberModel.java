package com.wimpy.patterns.singleton;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumberModel {

    private List<BigInteger> primeNumberList = new ArrayList<>();

    public PrimeNumberModel(int generateXAmountOfPrimeNumbers) {

        BigInteger primeNumber = BigInteger.ONE;
        primeNumberList.add(primeNumber);
        for (int i = 0; i < generateXAmountOfPrimeNumbers; i++) {
            primeNumber = primeNumber.nextProbablePrime();
            primeNumberList.add(primeNumber);
        }


    }

    public List<BigInteger> getPrimeNumberList() {
        return primeNumberList;
    }

    public void setPrimeNumberList(List<BigInteger> primeNumberList) {
        this.primeNumberList = primeNumberList;
    }
}
