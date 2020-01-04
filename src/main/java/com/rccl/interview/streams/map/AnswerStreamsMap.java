package com.rccl.interview.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnswerStreamsMap {
    
    public static final List<Double> doubleNumbersList = Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
    
    public static void main(String[] args) {
        getSquaresFunctionalApproach();
    }
    
    public static void getSquaresFunctionalApproach() {
        System.out.println("Square the numbers in functional approach: " + doubleNumbersList.stream()
                .map(num -> num * num)
                .distinct()
                .collect(Collectors.toList()));
    }
    
    
}
