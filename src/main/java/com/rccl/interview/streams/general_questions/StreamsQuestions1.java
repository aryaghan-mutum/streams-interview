package com.rccl.interview.streams.general_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * What are the results when the below methods are executed?
 */
public class StreamsQuestions1 {
    
    static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    
    public static void main(String[] args) {
        
        func();
        func2();
        func3();
    }
    
    public static void func() {
        
        List<Integer> numList = numbers.stream()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());
        
        numList.forEach(System.out::println);
    }
    
    public static void func2() {
        
        System.out.println(numbers.stream()
                .sorted()
                .filter(n -> n > 3)
                .collect(Collectors.averagingInt(n -> n)));
    }
    
    public static void func3() {
        
        System.out.println(numbers.stream()
                .filter(number -> number > 2)
                .count());
        
    }
    
}
