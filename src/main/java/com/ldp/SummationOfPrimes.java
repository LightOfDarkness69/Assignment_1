package com.ldp;

/*
Class for finding sum of all primes below specified limit.

EXAMPLE:
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17
*/

public class SummationOfPrimes {
    private int highLimit;

    public SummationOfPrimes(int highLimit) {
        this.highLimit = highLimit;
    }

    public long getSumOfPrimes() {

        long sum = 0;

        for (int i = 2; i < highLimit; i++) {
            if ( isPrime(i) ) sum += i;
        }

        return sum;
    }

    //Prime should be divisible only by 1 and itself
    boolean isPrime(int number) {

        for (int i = 2; i < number; i++)
            if (number % i == 0) return false;

        return true;
    }

}
