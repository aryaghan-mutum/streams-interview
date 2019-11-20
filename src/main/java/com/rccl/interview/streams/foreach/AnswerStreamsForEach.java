package com.rccl.interview.streams.foreach;

import java.util.Random;

public class AnswerStreamsForEach {
    
    public static void main(String[] args) {
        getFiveRandNumbersFunctionalApproach();
    }
    
    public static void getFiveRandNumbersFunctionalApproach() {
        
        Random random = new Random();
        random.doubles()
                .limit(5)
                .forEach(randNum -> System.out.println("Rand # functional approach: " + randNum));
        
    }
    
}
