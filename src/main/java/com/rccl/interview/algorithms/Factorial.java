package com.rccl.interview.algorithms;

/**
 * Question:
 * Write a factorial procedure.
 * Hint: if n = 0 then return 1, otherwise return n(n-1)
 */
public class Factorial {
    
    public static void main(String[] args) {
        
        try {
            
            System.out.println(factorialRecursive(10));
            System.out.println(factorialIterative(10));
            
        } catch (StackOverflowError e) {
            System.out.println(e);
        }
    }
    
    /**
     * Answer: In recursive approach
     */
    public static int factorialRecursive(final int number) {
        
        if (number == 1)
            return number;
        else
            return number * factorialRecursive(number - 1);
    }
    
    /**
     * Answer: In iterative approach
     */
    public static int factorialIterative(int number) {
        int result = 1;
        int i = 1;
        
        while (i <= number) {
            result = result * i;
            i++;
        }
        
        return result;
    }
    
}
