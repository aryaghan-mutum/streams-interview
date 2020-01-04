package com.rccl.interview.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionStreamsFlatMap3 {
    
    final static List<Integer> numbersList1 = Arrays.asList(1, 2, 3);
    final static List<Integer> numbersList2 = Arrays.asList(3, 4);
    
    public static void main(String[] args) {
        
        getPairsOfNumbers();
        getPairsOfNumbersSumIsDividedBy3();
    }
    
    /**
     * Given two lists of numbers, how would you return all pairs of numbers?
     * For example, given a list [1, 2, 3] and a list [3, 4] you should return [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)].
     * For simplicity, you can represent a pair as an array with two elements.
     */
    public static List<int[]> getPairsOfNumbers() {
        
        List<int[]> resultList = numbersList1.stream()
                .flatMap(i -> numbersList2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        
        return resultList;
    }
    
    /**
     * How would you extend the previous example to return only pairs whose sum is divisible by 3? For example, (2, 4) and (3, 3) are valid.
     */
    public static List<int[]> getPairsOfNumbersSumIsDividedBy3() {
        List<int[]> resultList = numbersList1.stream()
                .flatMap(i -> numbersList2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        
        return resultList;
    }
    
}
