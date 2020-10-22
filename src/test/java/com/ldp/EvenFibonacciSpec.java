package com.ldp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Even Fibonacci Members")
public class EvenFibonacciSpec {

    @Test
    @DisplayName("Find all even members below 10")
    public void findAllEvenMembersBelow10() {

        //BUILD PHASE
        EvenFibonacci evenFibonacci = new EvenFibonacci(10);

        //OPERATE PHASE
        long sum = evenFibonacci.getSumOfEvenMembers();

        //CHECK PHASE
        assertEquals(10L, sum); // 1, 2, 3, 5, 8
    }

    @Test
    @DisplayName("Find all even members below 35")
    public void findAllEvenMembersBelow35() {

        //BUILD PHASE
        EvenFibonacci evenFibonacci = new EvenFibonacci(35);

        //OPERATE PHASE
        long sum = evenFibonacci.getSumOfEvenMembers();

        //CHECK PHASE
        assertEquals(44L, sum); // 1, 2, 3, 5, 8, 13, 21, 34
    }

    @Test
    @DisplayName("Find all even members below 4_000_000")
    public void findAllEvenMembersBelow4_000_000() {

        //BUILD PHASE
        EvenFibonacci evenFibonacci = new EvenFibonacci(4_000_000);

        //OPERATE PHASE
        long sum = evenFibonacci.getSumOfEvenMembers();

        //CHECK PHASE
        assertEquals(4613732L, sum);
    }

}
