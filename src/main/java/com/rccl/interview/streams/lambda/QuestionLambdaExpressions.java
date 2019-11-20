package com.rccl.interview.streams.lambda;


/**
 * Question:
 *
 * Below is the function that uses Anonymous class and prints the result.
 * Use stateless lambda expression to achieve the same result.
 */
public class QuestionLambdaExpressions {
    
    interface Game {
        void play();
    }
    
    public static void main(String[] args) {
        
       // withoutUsingLambdaExpressions();
    }
    
//    private static void withoutUsingLambdaExpressions() {
//        Game footBall = new Game() {
//            public void play() {
//                System.out.println("I am playing football");
//            }
//        };
//
//        footBall.play();
//    }

}
