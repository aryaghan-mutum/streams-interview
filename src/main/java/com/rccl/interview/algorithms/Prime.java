package com.rccl.interview.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Question 1:
 * Write a method that check if a number is prime? For example: 3 is a prime, 4 is not.
 * You may write the method either in imperative or declarative style.
 *
 * Question 2:
 * Write a method that count the total count of prime numbers from this list: Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 *
 * Question 3:
 * Write a method that generates a list of prime from 2 to 20
 *
 */
public class Prime {
    
    public static void main(String[] args) {
        
        System.out.println(isPrimeInImperativeApproach(3));
        System.out.println(isPrimeInFunctionalApproach1(3));
        
        System.out.println("Prime Num Count: " + primeNumCount());
        
        System.out.println("primesList:" + primes(2, 20));
    }
    
    /**
     * Answer for Question 1 imperative approach
     */
    private static boolean isPrimeInImperativeApproach(int num) {
        
        if (num <= 1)
            return false;
        
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return num > 1;
    }
    
    /**
     * Answer for Question 1 declarative approach
     */
    private static boolean isPrimeInFunctionalApproach1(int num) {
        
        return num > 1 &&
                IntStream.range(2, num)
                        .noneMatch(divisor -> num % divisor == 0);
    }
    
    /**
     * Answer for Question 1 declarative approach 2
     */
    private static boolean isPrimeInFunctionalApproach2(int num) {
        
        return num > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(num))
                        .noneMatch(divisor -> num % divisor == 0);
    }
    
    /**
     * Answer for Question 3
     * @return The total count of the prime numbers
     */
    private static long primeNumCount() {
        
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        return numbersList.stream()
                .filter(Prime::isPrimeInFunctionalApproach1)
                .count();
    }
    
    /**
     * Answer for Question 2
     */
    public static List<Integer> primes(final int fromNumber, final int count) {
        return Stream.iterate(primeAfter(fromNumber - 1), Prime::primeAfter)
                .limit(count)
                .collect(Collectors.toList());
    }
    
    private static int primeAfter(final int number) {
        if (isPrimeInFunctionalApproach1(number + 1))
            return number + 1;
        else
            return primeAfter(number + 1);
    }
}


