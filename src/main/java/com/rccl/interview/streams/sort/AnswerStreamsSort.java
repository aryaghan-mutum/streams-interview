package com.rccl.interview.streams.sort;

import java.util.Arrays;
import java.util.List;

public class AnswerStreamsSort {
    
    public static final List<String> citiesList = Arrays.asList("miami", "columbus", "san francisco", "fargo");
    
    public static void main(String[] args) {
    
        convertCitiesToUppercaseFunctionalApproach();
    }
    
    
    public static void convertCitiesToUppercaseFunctionalApproach() {
        
        citiesList.stream()
                .sorted()
                .forEach(city -> System.out.println("Cities in uppercase functional approach: " + city.toUpperCase()));
    }
    
}



