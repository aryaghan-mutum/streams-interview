package com.rccl.interview.algorithms;

/**
 * Reverse the number 54321 to 12345
 */
public class Reverse {
    
    public static void main(String[] args) {
        
        int num = 54321;
        int reverse = 0;
        
        while (num != 0) {
            
            int a = num % 10;
            
            reverse = reverse * 10 + a;
            
            num = num / 10;
            
        }
        
        System.out.println(reverse);
    }
    
    
}
