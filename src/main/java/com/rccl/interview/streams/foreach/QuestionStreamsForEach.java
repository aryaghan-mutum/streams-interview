package com.rccl.interview.streams.foreach;

public class QuestionStreamsForEach {
    
    /**
     * Given: getFiveRandNumbersIterativeApproach() which generates 5 rand numbers in iterative style.
     * Create a method that generates 5 rand numbers using Stream API using declarative style.
     */
    public static void main(String[] args) {
        
        getFiveRandNumbersIterativeApproach();
    }
    
    public static void getFiveRandNumbersIterativeApproach() {
        
        for (int i = 0; i < 5; i++) {
            double randNum = ((Math.random()));
            System.out.println("Rand # imperative approach: " + randNum);
        }
        
    }
    
}
