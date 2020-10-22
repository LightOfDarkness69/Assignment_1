package com.ldp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Sum Of Multiples")
public class SumOfMultiplesSpec {

    @Test
    @DisplayName("Find sum of all multiples of 3 and 5 below 10")
    public void findSumOfAllMultiplesOf3and5below10() {

        //BUILD PHASE
        SumOfMultiples sumOfMultiples = new SumOfMultiples(10, 3, 5);

        //OPERATE PHASE
        long sum = sumOfMultiples.getSumOfMultiples();

        //CHECK PHASE
        assertEquals(23L, sum);
    }

    @Test
    @DisplayName("Find sum of all multiples of 3 and 5 below 1000")
    public void findSumOfAllMultiplesOf3and5below1000() {

        //BUILD PHASE
        SumOfMultiples sumOfMultiples = new SumOfMultiples(1000, 3, 5);

        //OPERATE PHASE
        long sum = sumOfMultiples.getSumOfMultiples();

        //CHECK PHASE
        assertEquals(233168L, sum);

    }

    @Test
    @DisplayName("Find sum of all multiples of 2 below 13")
    public void findSumOfAllMultiplesOf2below13() {

        //BUILD PHASE
        SumOfMultiples sumOfMultiples = new SumOfMultiples(13, 2);

        //OPERATE PHASE
        long sum = sumOfMultiples.getSumOfMultiples();

        //CHECK PHASE
        assertEquals(42L, sum);

    }

}
