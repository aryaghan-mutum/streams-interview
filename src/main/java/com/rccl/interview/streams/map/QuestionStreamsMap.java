package com.rccl.interview.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Below is the method that squares(doubles) each number in a list using traditional approach
 * Write a method in functional style to achieve the same result using map(), distinct() and collect() operators
 */
public class QuestionStreamsMap {
    
    public static final List<Double> doubleNumbersList = Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
    
    
    public static void main(String[] args) {
        
        getSquaresImperativeApproach();
    }
    
    public static void getSquaresImperativeApproach() {
        
        List<Double> squaresList = new ArrayList<Double>();
        
        for (Double number : doubleNumbersList) {
            Double square = new Double(number.intValue() * number.intValue());
            
            if (!squaresList.contains(square)) {
                squaresList.add(square);
            }
        }
        System.out.println("Square the numbers in imperative approach: " + squaresList);
    }
    
}
