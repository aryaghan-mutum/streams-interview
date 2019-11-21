package com.rccl.interview.streams.general_questions;

import java.util.Arrays;
import java.util.List;

public class AnswerStreamsImperative {
    
    public static final List<String> citiesList = Arrays.asList("miami", "columbus", "san francisco", "fargo");
    
    public static void main(String[] args) {
    
        isFargoPresentFunctionalApproach1();
        isFargoPresentFunctionalApproach2();
        printCityName();
    }
    
    public static void isFargoPresentFunctionalApproach1() {
        System.out.println("City found functional approach 1: " + citiesList.stream()
                .filter(city -> city.equals("fargo"))
                .findAny()
                .isPresent());
    }
    
    public static void isFargoPresentFunctionalApproach2() {
        System.out.println("City found functional approach 2: " + citiesList.stream()
                .anyMatch(city -> city.equals("fargo")));
    }
    
    //  Prints the city name:
    public static void printCityName() {
        citiesList.stream()
                .filter(city -> city.endsWith("fargo"))
                .findAny()
                .ifPresent(city -> System.out.println("City found functional approach 4: " + city));
    }
}
