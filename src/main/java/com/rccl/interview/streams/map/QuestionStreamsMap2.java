package com.rccl.interview.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionStreamsMap2 {
    
    public static void main(String[] args) {
        
        System.out.println(doubleTheNumbers());
    }
    
    
    /**
     * Given a list of numbers, how would you return a list of the square of each number?
     * For example, given [1, 2, 3, 4, 5] you should return [1, 4, 9, 16, 25].
     */
    public static List<Integer> doubleTheNumbers() {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6);
        return numbersList.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
    
}
