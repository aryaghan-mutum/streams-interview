package com.rccl.interview.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class QuestionStreamsReduce2 {
    
    public static final List<Double> doubleNumbersList = Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
    
    public static void main(String[] args) {
        
        // get count
        System.out.println(getTotalCountIterativeApproach());
        System.out.println(getTotalCountFunctionalApproach());
    }
    
    public static long getTotalCountIterativeApproach() {
        
        int sum = 0;
        for (double n : doubleNumbersList) {
            sum = sum + 1;
        }
        
        return sum;
    }
    
    public static long getTotalCountFunctionalApproach() {
        int count = doubleNumbersList.stream()
                .map(d -> 1)
                .reduce(0, (a, b) -> a + b);
        
        return count;
    }
    
}



