package com.rccl.interview.streams.lambda.resuing_lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReuseLambdaExpressionsEx1 {
    
    public static final List<Integer> numbersList1 = Arrays.asList(new Integer[]{1, 2, 3});
    public static final List<Integer> numbersList2 = Arrays.asList(new Integer[]{2, 3, 4});
    public static final List<Integer> numbersList3 = Arrays.asList(new Integer[]{3, 4, 5});
    
    public static final List<String> flowersList1 = Arrays.asList(new String[]{"angelonia", "snapdragon", "laceleaf", "primrose", "hollyhock", "cyclamen"});
    public static final List<String> flowersList2 = Arrays.asList(new String[]{"sun flower", "larkspur", "pansy", "anemone", "snowdrop", "peony"});
    public static final List<String> flowersList3 = Arrays.asList(new String[]{"lily", "amaranth", "crown imperial", "lavender", "amaryllis", "honeysuckle"});
    
    
    public static void main(String[] args) {
        
        ReuseLambdaExpressionsEx1 reuseLambdaExpressions = new ReuseLambdaExpressionsEx1();
        
        reuseLambdaExpressions.withoutReusingLambdaExpressionsForStrings();
        reuseLambdaExpressions.reusingLambdaExpressionsForStrings();
        
        reuseLambdaExpressions.withoutReusingLambdaExpressionForNumbers();
        reuseLambdaExpressions.reusingLambdaExpressionsForNumbers();
        
    }
    
    /**
     * Without Reusing the code:
     * The method prints the count of flowers that starts with the letter "a" for the three distinct lists
     */
    private void withoutReusingLambdaExpressionsForStrings() {
        
        System.out.println("Approach 1: Flower list 1 Count: " + flowersList1
                .stream()
                .filter(flower -> flower.startsWith("a"))
                .count());
        
        System.out.println("Approach 1: Flower list 2 Count: " + flowersList2
                .stream()
                .filter(flower -> flower.startsWith("a"))
                .count());
        
        System.out.println("Approach 1: Flower list 3 Count: " + flowersList3
                .stream()
                .filter(flower -> flower.startsWith("a"))
                .count());
    }
    
    /**
     * Reusing the code:
     * The method prints the count of flowers that starts with the letter "a" for the three different lists
     */
    private void reusingLambdaExpressionsForStrings() {
        
        Predicate<String> flowersStartsWithLetterA = flower -> flower.startsWith("a");
        
        System.out.println("Approach 2: Flower list 1 Count: " + flowersList1
                .stream()
                .filter(flowersStartsWithLetterA)
                .count());
        
        System.out.println("Approach 2: Flower list 2 Count: " + flowersList2
                .stream()
                .filter(flowersStartsWithLetterA)
                .count());
        
        System.out.println("Approach 2: Flower list 3 Count: " + flowersList3
                .stream()
                .filter(flowersStartsWithLetterA)
                .count());
    }
    
    /**
     * Without Reusing the code:
     * The method prints the number if the given number is equal to the number present in the list for three different lists
     */
    private void withoutReusingLambdaExpressionForNumbers() {
        
        numbersList1
                .stream()
                .filter(number -> number.equals(3))
                .forEach(System.out::println);
        
        numbersList2
                .stream()
                .filter(number -> number.equals(3))
                .forEach(System.out::println);
        
        numbersList3
                .stream()
                .filter(number -> number.equals(3))
                .forEach(System.out::println);
    }
    
    /**
     * Reusing the code:
     * The method prints the number if the given number is equal to the number present in the list for three different lists
     */
    private void reusingLambdaExpressionsForNumbers() {
        
        Predicate<Integer> numberEqualsTo3 = number -> number.equals(3);
        
        numbersList1
                .stream()
                .filter(numberEqualsTo3)
                .forEach(System.out::println);
        
        numbersList2
                .stream()
                .filter(numberEqualsTo3)
                .forEach(System.out::println);
        
        numbersList3
                .stream()
                .filter(numberEqualsTo3)
                .forEach(System.out::println);
    }
}
