package com.ushwamala.interview.fibonacci;



/* * Java Program to calculate Fibonacci numbers with memorization
 * * This is quite fast as compared to previous Fibonacci function
 * * especially for calculating factorial of large numbers. */

import static com.ushwamala.interview.fibonacci.Fibonacci.generateFibonacciNumbersUpTo;

public class FibonacciMemorization {
    public static void main(String[] args) {

    }

   /* public static int improvedFibonacci(int upTo) {
        Cache cache = new Cache();
        Integer fibonacci = cache.get(upTo);
        if (fibonacci != null) {
            return fibonacci; //fibonacci number from cache
        }
        fibonacci = generateFibonacciNumbersUpTo(upTo);

        cache.put(upTo, fibonacci);
        return fibonacci;
    }*/
}
