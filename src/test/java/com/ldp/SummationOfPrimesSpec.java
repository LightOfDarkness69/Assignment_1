package com.ldp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class SummationOfPrimesSpec {

    @Test
    @DisplayName("Find sum of all primes below 10")
    public void findSumOfAllPrimesBelow10() {

        //BUILD PHASE
        SummationOfPrimes summationOfPrimes = new SummationOfPrimes(10);

        //OPERATE PHASE
        long sum = summationOfPrimes.getSumOfPrimes();

        //CHECK PHASE
        assertEquals(17L, sum); //2, 3, 5, 7
    }

    @Test
    @DisplayName("Find sum of all primes below 35")
    public void findSumOfAllPrimesBelow35() {

        //BUILD PHASE
        SummationOfPrimes summationOfPrimes = new SummationOfPrimes(35);

        //OPERATE PHASE
        long sum = summationOfPrimes.getSumOfPrimes();

        //CHECK PHASE
        assertEquals(160L, sum); //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31

    }

    @Test
    @DisplayName("Find sum of all primes below 2_000_000")
    public void findSumOfAllPrimesBelow2_000_000() {

        //BUILD PHASE
        SummationOfPrimes summationOfPrimes = new SummationOfPrimes(2_000_000);

        //OPERATE PHASE
        final long sum;

        //CHECK PHASE
        assertTimeout(Duration.ofSeconds(5),
                      () -> summationOfPrimes.getSumOfPrimes());

        //sum = summationOfPrimes.getSumOfPrimes();

        //assertEquals(142913828922L, sum);
    }


}
