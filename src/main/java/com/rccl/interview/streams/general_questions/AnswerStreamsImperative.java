package com.rccl.interview.streams.general_questions;

import java.util.Arrays;
import java.util.List;

public class AnswerStreamsImperative {
    
    public static final List<String> citiesList = Arrays.asList("miami", "columbus", "san francisco", "fargo");
    
    public static void main(String[] args) {
    
        getACityFromListFunctionalApproach1();
        getACityFromListFunctionalApproach2();
        getACityFromListFunctionalApproach3();
    }
    
    public static void getACityFromListFunctionalApproach1() {
        System.out.println("City found functional approach 1: " + citiesList.stream()
                .filter(city -> city.equals("fargo"))
                .findAny()
                .isPresent());
    }
    
    public static void getACityFromListFunctionalApproach2() {
        System.out.println("City found functional approach 2: " + citiesList.stream()
                .anyMatch(city -> city.equals("fargo")));
    }
    
    // functional approach 3. Prints the city name:
    public static void getACityFromListFunctionalApproach3() {
        citiesList.stream()
                .filter(city -> city.endsWith("columbus"))
                .findAny()
                .ifPresent(city -> System.out.println("City found functional approach 4: " + city));
        
    }
}
