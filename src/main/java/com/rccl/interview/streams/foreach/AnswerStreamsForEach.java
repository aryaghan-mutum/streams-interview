package com.rccl.interview.streams.foreach;

import java.util.Random;
import java.util.stream.Stream;

public class AnswerStreamsForEach {
    
    public static void main(String[] args) {
        getFiveRandNumbersFunctionalApproach();
        getFiveRandNumbersUsingGenerate();
    }
    
    public static void getFiveRandNumbersFunctionalApproach() {
        
        Random random = new Random();
        random.doubles()
                .limit(5)
                .forEach(randNum -> System.out.println(randNum));
    }
    
    private static void getFiveRandNumbersUsingGenerate() {
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
