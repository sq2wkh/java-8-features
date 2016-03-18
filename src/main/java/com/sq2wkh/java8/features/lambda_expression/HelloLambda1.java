package com.sq2wkh.java8.features.lambda_expression;

public class HelloLambda1 {
    public static void main(String[] args) {
        System.out.println("=== HelloLambda1 ===");
        // Anonymous Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from runnable 1 one!");
            }
        };
        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello from runnable 2 one!");
        // Run em!
        r1.run();
        r2.run();
    }
}