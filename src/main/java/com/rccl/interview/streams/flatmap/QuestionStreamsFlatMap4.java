package com.rccl.interview.streams.flatmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class QuestionStreamsFlatMap4 {
    
    public static void main(String[] args) {
        
        List<Integer> list = func2();
        
        System.out.println();
        
        
    }
    
    private static List<Integer> func2() {
        return Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());
        
    }
    
    
}
