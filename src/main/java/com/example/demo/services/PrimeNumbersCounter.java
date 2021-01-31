package com.example.demo.services;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrimeNumbersCounter {

    public static boolean isPrime(BigInteger n) {
        if(n.compareTo(BigInteger.TWO) == 0) {
            return true;
        }
        else if(n.compareTo(BigInteger.ONE) != 1 || n.mod(BigInteger.TWO).compareTo(BigInteger.ONE) != 0) {
            return false;
        }
        return n.isProbablePrime(1);
    }

    public static Map primeNumbers(BigInteger[] array) {
        Map<BigInteger, Long> map = Arrays.stream(array).parallel().filter(
                x -> PrimeNumbersCounter.isPrime(x)).collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        ));
        return map;
    }
}
