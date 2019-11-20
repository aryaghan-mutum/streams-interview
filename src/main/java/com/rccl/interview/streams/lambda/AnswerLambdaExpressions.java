package com.rccl.interview.streams.lambda;

public class AnswerLambdaExpressions {
    
    interface Game {
        void play();
    }
    
    interface Series {
        void play(String type);
    }
    
    public static void main(String[] args) {
        
        withUsingLambdaExpressions();
    }
    
    private static void withUsingLambdaExpressions() {
        Game footballLambda = () -> System.out.println("I am playing football");
        footballLambda.play();
        
        Series basketballSeries = (type) -> System.out.println("This is an basketball series");
        basketballSeries.play("basketball");
    }
    
    
}
