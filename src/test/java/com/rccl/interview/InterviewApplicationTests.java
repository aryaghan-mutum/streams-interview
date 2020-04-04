package com.rccl.interview;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class InterviewApplicationTests {
    
    final List<Double> doubleNumbersList = Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
    
    
    @Test
    void contextLoads() {
    
        doubleNumbersList.stream().reduce(0.0, (total, n) -> Double.sum(total, n));
        
        System.out.println(sum(100));
    }
    
    @Test
    public void test1() {
        System.out.println(fibo2(1000));
    }
    
    private long sum(long n){
        return Stream
                .iterate(new long[]{n}, a -> new long[]{a[0] / 10, a[0] % 10})
                .filter(f -> f.length > 1)
                .limit(String.valueOf(n).length())
                .flatMap(m -> Stream.of(m[1]))
                .mapToLong(Long::longValue).sum();
    }
    
    void fibo(int num){
        Stream.iterate(new long[]{1, 1}, p -> new long[]{p[1], p[0] + p[1]})
                .limit(num).forEach(v -> System.out.println(v[0]));
    }
    
    private BigInteger fibo2(int num) {
        return Stream.iterate(new BigInteger[] {BigInteger.ONE, BigInteger.ONE},
                p -> new BigInteger[] {p[1], p[0].add(p[1])})
                .limit(num).reduce((a, b) -> b)
                .get()[0];
    }
    
    @Test
    public void gg() {
        List<String> itemsList = Arrays.asList("apple", "bat", "apple", "car");
        run(itemsList);
    }
    
    public List<String> run(List<String> itemsList) {
        
        // List<Integer> countList = new ArrayList();
        int counter = 0;
        
        Map<String, Long> countsMap = itemsList.stream()
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));
        
        System.out.println(countsMap);
        return itemsList;
    }
    
    
}
