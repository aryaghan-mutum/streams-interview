package com.rccl.interview.streams.general_questions;

import java.util.Arrays;
import java.util.List;

/**
 * Convert the imperative approach into functional approach for the below method.
 */
public class QuestionStreamsImperative {
    
    public static final List<String> citiesList = Arrays.asList("miami", "columbus", "san francisco", "fargo");
    
    public static void main(String[] args) {
        
        isFargoPresent();
    }
    
    /**
     * The procedure iterates each city in a list and when the city=fargo then return true, otherwise false.
     */
    public static void isFargoPresent() {
        
        // imperative approach 1:
        boolean found = false;
        
        for (int i = 0; i < citiesList.size(); i++) {
            if (citiesList.get(i).equals("fargo")) {
                found = true;
                System.out.println("City found imperative approach 1 " + found);
            }
        }
        
        // imperative approach 2:
        System.out.println("City found imperative approach 2 " + citiesList.contains("fargo"));
        
        
    }
}
