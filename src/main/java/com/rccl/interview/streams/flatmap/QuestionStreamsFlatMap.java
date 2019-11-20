package com.rccl.interview.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * flatMap() :
 * 1. flatMap() is a mix of map() and flat() functions.
 * 2. It transforms and flattens the items in a stream
 *
 *
 * Here is the Input: List("BANANA", "APPLE", "GRAPES")
 * Get the unique chars Output: [P, A, B, R, S, E, G, L, N]
 */

public class QuestionStreamsFlatMap {
    
    static List<String> upperCaseFruitsList = Arrays.asList(new String[]{"BANANA", "APPLE", "GRAPES"});
    
    public static void main(String[] args) {
        
        //What is the difference between these two methods?
        getUniqueCharsFromListOfFruitsFunc1();
        getUniqueCharsFromListOfFruitsFunc2();
        
    }
    
    /**
     * Question: Why The below program doesn't print the unique characters?
     * Answer: The method doesn't print the unique characters because the map returns an array of String[] for each fruit.
     * But we need it to return a Stream<String> of unique characters
     */
    public static void getUniqueCharsFromListOfFruitsFunc1() {
        System.out.println("Unique Chars From list Of Fruits :" + upperCaseFruitsList.stream()
                .map(fruit -> fruit.split(""))
                .collect(Collectors.toSet()));
    }
    
    /**
     * use flatMap() function to map each array not with the stream but with the contents of the stream.
     * It flattens the array of stream
     * Arrays::stream takes an array and returns a stream
     */
    public static void getUniqueCharsFromListOfFruitsFunc2() {
        System.out.println("Unique Chars From list Of Fruits :" + upperCaseFruitsList.stream()
                .map(fruit -> fruit.split(""))
                .flatMap(fruit -> Arrays.stream(fruit))
                .collect(Collectors.toSet()));
    }
    
    
}



