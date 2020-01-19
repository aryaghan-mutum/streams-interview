package com.rccl.interview.streams.reduce;

import java.util.Arrays;
import java.util.List;

public class QuestionStreamsReduce {
    
    /**
     * Question:
     * Below is a method which adds the numbers in the array using traditional for loop.
     * Write a procedure which sums the numbers in a list using reduce operator in functional style (declarative approach).
     */
    
    public static final List<Double> doubleNumbersList = Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
    
    public static void main(String[] args) {
        
        getSumImperativeApproach();
    }
    
    public static void getSumImperativeApproach() {
        
        double sum = 0;
        for (int i = 0; i < doubleNumbersList.size(); i++) {
            
            if (!doubleNumbersList.isEmpty()) {
                sum = sum + doubleNumbersList.get(i);
            }
        }
        System.out.println("Sum in Imperative approach: " + sum);
    }
}



