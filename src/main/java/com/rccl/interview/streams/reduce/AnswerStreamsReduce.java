package com.rccl.interview.streams.reduce;

import java.util.Arrays;
import java.util.List;

/**
 * reduce() :
 * It takes two arguments and returns a scalar (single value). Therefore is a terminal operator.
 */
public class AnswerStreamsReduce {
    
    public static final List<Double> doubleNumbersList = Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
    
    public static void main(String[] args) {
        getSumFunctionalApproach1();
        getSumFunctionalApproach2();
        getSumFunctionalApproach3();
        getSumFunctionalApproach4();
    }
    
    public static void getSumFunctionalApproach1() {
        System.out.println("Sum in Functional approach 1: " + doubleNumbersList.stream()
                .reduce(0.0, (total, n) -> Double.sum(total, n)));
    }
    
    public static void getSumFunctionalApproach2() {
        System.out.println("Sum in Functional approach 2: " + doubleNumbersList.stream()
                .reduce(0.0, Double::sum));
    }
    
    public static void getSumFunctionalApproach3() {
        System.out.println("Sum in Functional approach 3: " + doubleNumbersList.stream()
                .reduce((a, b) -> a + b));
    }
    
    public static void getSumFunctionalApproach4() {
        System.out.println("Sum in Functional approach 4: " + doubleNumbersList.stream()
                .mapToDouble(n -> n)
                .sum());
    }
    
}
