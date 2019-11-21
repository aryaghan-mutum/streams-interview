package com.rccl.interview.algorithms;

/**
 * Question:
 * Write a fibonacci procedure.
 * <p>
 * Hint:
 * if n = 0 then return 0,
 * if n = 1 then return 1,
 * otherwise f(n-1) + f (n -2)
 * <p>
 * The first 10 Fibonacci Series:
 * n:    0 1 2 3 4 5 6  7  8  9 10
 * F(n): 0 1 1 2 3 5 8 13 21 34 55
 */
public class Fibonacci {
    
    
    public static void main(String[] args) {
        
        System.out.println(fibonacciRec(10));
        System.out.println(fibonacciIter(10));
    }
    
    /**
     * Answer: In recursive approach
     */
    public static int fibonacciRec(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }
    
    /**
     * Answer: In iterative approach:
     */
    public static int fibonacciIter(int nthNumber) {
        
        int previousPreviousNumber, previousNumber = 0, currentNumber = 1;
        
        if (nthNumber == 0) {
            return 0;
        }
        
        for (int i = 1; i < nthNumber; i++) {
            
            previousPreviousNumber = previousNumber;
            
            previousNumber = currentNumber;
            
            currentNumber = previousPreviousNumber + previousNumber;
            
        }
        return currentNumber;
    }
}


