package com.rccl.interview.streams.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * flatMap() :
 * 1. flatMap() is a mix of map() and flat() functions.
 * 2. It transforms and flattens the items in a stream
 */

public class QuestionStreamsFlatMap2 {
    
    final static List<List<Integer>> oddAndEvenNumsList = asList(asList(1, 3, 5), asList(2, 4, 6, 8));
    
    public static void main(String[] args) {
        
        System.out.println(flatMapListFunctionalApproach());
        System.out.println(flatMapListsImperativeApproach());
        
    }
    
    public static List<Integer> flatMapListFunctionalApproach() {
        return oddAndEvenNumsList.stream()
                .flatMap(lst -> lst.stream())
                .collect(Collectors.toList());
    }
    
    public static List<Integer> flatMapListsImperativeApproach() {
        
        List<Integer> tempList = new ArrayList<>();
        for (List<Integer> numbersList : oddAndEvenNumsList) {
            for (Integer number : numbersList) {
                tempList.add(number);
            }
        }
        
        return tempList;
    }
    
}

    




