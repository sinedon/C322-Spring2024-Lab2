package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n/2; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; ++i) {
            while (n % i == 0 && isPrime(i)) {
                factors.add(i);
                n /= i;
            }
        }
        if (factors.size() == 1) {
            factors.clear();
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(isPrime(465));
        System.out.println(isPrime(7919));
        System.out.println(primeFactors(17));
        System.out.println(primeFactors(15));
        System.out.println(primeFactors(6893));
    }
}