package com.rccl.interview.streams.filter;

import java.util.Arrays;
import java.util.List;

public class QuestionStreamsFilter {
    
    
    /**
     * The code is repeating in f1() an f2() how do you reduce the repeated code using Predicate<T> functional interface and <lambda expressions
     */
    public static void main(String[] args) {
        
        f1();
        f2();
        
    }
    
    public static void f1() {
        
        List<String> citiesList = Arrays.asList("miami", "columbus", "san francisco", "fargo");
        
        System.out.println(citiesList.stream()
                .filter(city -> city.equals("fargo"))
                .findAny()
                .isPresent());
    }
    
    public static void f2() {
        
        List<String> citiesList = Arrays.asList("miami", "columbus", "san francisco", "fargo");
        
        System.out.println(citiesList.stream()
                .filter(city -> city.equals("columbus"))
                .findAny()
                .isPresent());
    }
    
    
}
