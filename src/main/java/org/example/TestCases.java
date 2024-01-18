package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestCases {

    @Test
    void testPrimeFactors() {
        assertTrue(Main.primeFactors(17).isEmpty());
        assertEquals(List.of(3, 5), Main.primeFactors(15));
        assertEquals(List.of(61, 113), Main.primeFactors(6893));
    }

    @Test
    void testPrimeNumber() {
        assertTrue(Main.isPrime(17));
        assertFalse(Main.isPrime(465));
        assertTrue(Main.isPrime(7919));
    }
}

