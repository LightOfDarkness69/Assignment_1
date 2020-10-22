package com.ldp;

/*
Finds a sum of all multiples for given numbers below specified limit;

EXAMPLE:
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.
*/
public class SumOfMultiples {
    private int[] givenNumbers;
    private long highLimit;

    public SumOfMultiples(long highLimit, int...givenNumbers) {
        this.highLimit = highLimit;
        this.givenNumbers = givenNumbers;
    }

    public long getSumOfMultiples() {
        long sumOfMultiples = 0;

        for (int i = 1; i < highLimit; i++) {
            if (isMultiple(i))
                sumOfMultiples += i;
        }

        return sumOfMultiples;
    }

    boolean isMultiple(int number) {

        for (int i = 0; i < givenNumbers.length; i++)
            if (number % givenNumbers[i] == 0) return true;

        return false;
    }
}
