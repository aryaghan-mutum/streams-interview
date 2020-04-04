package com.rccl.interview.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  1) Write a function that accepts an array/list of strings, counts the
 *  occurrence of each string, and then returns a data structure with
 *  each unique string and the number of times it occurred. For example,
 *  given an input that contains:
 *
 *  ["apple", "bat", "apple", "car"]
 *
 *      the function should return a data structure that has a count of 2 for
 *      "apple", 1 for "bat", and 1 for "car".
 *
 *      Notes:
 *
 *        a) Your solution should ignore differences in upper/lowercase:
 *           "Apple" should be treated as "apple"
 *        b) Your solution should trim/strip/remove all
 *           leading/trailing/inner whitespace: " app le " should be treated
 *           as "apple"
 *        c) Your solution should trim/strip/remove any non-alphanumeric
 *           characters (a-z, A-Z, 0-9): "apple!" should be treated as
 *           "apple"
 *
 */
public class StringOccurences {
    
    public static void main(String[] args) {
        
        List<String> itemsList = Arrays.asList("apple", "Apple", "bat", "B at", "apple", "car", "c3ar 2");
        
        Map<String, Long> resultMap = run(itemsList);
        System.out.println(resultMap);  //result: {apple=2, bat=1, car=1}
    }
    
    /**
     Time Complexity: O(n) since we have a linear list of 'n' items
     Space Complexity: O(n) since the list takes `n` amount of space in heap/stack
     The algorithm takes a list as input and retuns a HashMap object of String as Key and Long as       value
     **/
    public static Map<String, Long> run(List<String> itemsList) {
        
        Map<String, Long> countsMap = itemsList.stream()
                .map(String::toLowerCase)
                .map(item -> item.replaceAll(" +", ""))
                .map(item -> item.replaceAll("[0-9]", ""))
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));
        
        return countsMap;
    }
}
