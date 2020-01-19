package com.rccl.interview.streams.build_streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class BuildStreams {
    
    public static void main(String[] args) {
        
        streamsContainValues();
        streamsFromArrays();
    }
    
    private static void streamsFromArrays() {
        int[] numbers = {4, 53, 4, 31, 32, 43};
        
        double sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
    }
    
    private static void streamsContainValues() {
        Stream<String> stream = Stream.of("Royal", "caribbean ", "cruise ", "miami");
        stream.map(String::toUpperCase)
                .forEach(System.out::println);
    }
    
}
