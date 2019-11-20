package com.rccl.interview.streams.lambda.resuing_lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReuseLambdaExpressionsWithLexicalScopingEx2 {
    
    
    public static final List<Integer> numbersList1 = Arrays.asList(new Integer[]{1, 2, 3});
    public static final List<Integer> numbersList2 = Arrays.asList(new Integer[]{2, 3, 4});
    public static final List<Integer> numbersList3 = Arrays.asList(new Integer[]{3, 4, 5});
    
    public static final List<String> flowersList1 = Arrays.asList(new String[]{"angelonia", "snapdragon", "laceleaf", "primrose", "hollyhock", "cyclamen"});
    public static final List<String> flowersList2 = Arrays.asList(new String[]{"sun flower", "larkspur", "pansy", "anemone", "snowdrop", "peony"});
    public static final List<String> flowersList3 = Arrays.asList(new String[]{"lily", "amaranth", "crown imperial", "lavender", "amaryllis", "honeysuckle"});
    
    
    public static void main(String[] args) {
        
        ReuseLambdaExpressionsWithLexicalScopingEx2 reuseLambdaExpressionsWithLexicalScopingEx2 = new ReuseLambdaExpressionsWithLexicalScopingEx2();
        
        reuseLambdaExpressionsWithLexicalScopingEx2.reusingLambdaExpressionsWithLexicalScopingForStrings();
        
        reuseLambdaExpressionsWithLexicalScopingEx2.reusingLambdaExpressionsWithLexicalScopingForNumbers();
    }
    
    /**
     * The method takes any alphabet and checks if the flower starts with a certain alphabet
     */
    private static Predicate<String> verifyIfTheFlowerNameStartsWith(String alphabet) {
        return flower -> flower.startsWith(alphabet);
    }
    
    /**
     * Reusing the code:
     * The method prints the count of flowers that starts with any letter based on users input for the three different lists
     */
    private void reusingLambdaExpressionsWithLexicalScopingForStrings() {
        
        System.out.println("Approach 3: Flower list 1 Count alphabet 'a': " + flowersList1
                .stream()
                .filter(verifyIfTheFlowerNameStartsWith("a"))
                .count());
        
        System.out.println("Approach 3: Flower list 2 Count for alphabet 'p': " + flowersList2
                .stream()
                .filter(verifyIfTheFlowerNameStartsWith("p"))
                .count());
        
        System.out.println("Approach 3: Flower list 3 Count for alphabet 'l': " + flowersList3
                .stream()
                .filter(verifyIfTheFlowerNameStartsWith("l"))
                .count());
    }
    
    /**
     * The method takes any number and checks if the number equals with a number present in the list
     */
    private static Predicate<Integer> verifyIfTheNumberEqualsTo3(Integer number) {
        return n -> n.equals(number);
    }
    
    /**
     * Reusing the code:
     * The method prints the number if the given number is equal to the number present in the list for three different lists
     */
    private void reusingLambdaExpressionsWithLexicalScopingForNumbers() {
        
        numbersList1
                .stream()
                .filter(verifyIfTheNumberEqualsTo3(2))
                .forEach(System.out::println);
        
        numbersList2
                .stream()
                .filter(verifyIfTheNumberEqualsTo3(3))
                .forEach(System.out::println);
        
        numbersList3
                .stream()
                .filter(verifyIfTheNumberEqualsTo3(4))
                .forEach(System.out::println);
    }
    
}
