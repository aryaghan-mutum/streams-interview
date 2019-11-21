package com.rccl.interview.streams.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Question:
 * The below procedure converts a list of cities into uppercase and sorts in ascending order using imperative style of programming
 * Write a procedure that iterates each city in a list and sort it in ascending order using functional programming
 */
public class QuestionStreamsSort {
    
    public static final List<String> citiesList = Arrays.asList("miami", "columbus", "san francisco", "fargo");
    
    public static void main(String[] args) {
        
        convertCitiesToUppercaseImperativeApproach();
    }
    
    
    public static void convertCitiesToUppercaseImperativeApproach() {
        
        citiesList.sort(Comparator.naturalOrder());
        
        for (String city : citiesList) {
            System.out.println("Cities in uppercase imperative approach: " + city.toUpperCase());
        }
    }
    
}



