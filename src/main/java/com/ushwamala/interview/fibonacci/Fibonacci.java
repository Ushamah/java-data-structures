package com.ushwamala.interview.fibonacci;

import java.util.function.Function;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacciNumbersUpTo(11);
    }

    /* * Java program to calculate Fibonacci number using loop or Iteration.
     * * @return Fibonacci number */
    public static int generateFibonacciNumbersUpTo(int numOfFibonacci) {
        int firstFibonacci = 1, secondFibonacci = 1, fibonacci = 1;
        if (numOfFibonacci == 1 || numOfFibonacci == 2) {
            return 1;
        }

        int i = 3;
        while (i <= numOfFibonacci) {
            fibonacci = firstFibonacci + secondFibonacci;
            firstFibonacci = secondFibonacci;
            secondFibonacci = fibonacci;
            i++;
        }
        return fibonacci;
    }

    /* * Java program for Fibonacci number using recursion.
    * * This program uses tail recursion to calculate Fibonacci number
    * * for a given number
    * * @return Fibonacci number
    * */

    public static int fibonacci(int numOfFibonacci) {
        if (numOfFibonacci == 1 || numOfFibonacci == 2) {
            return 1;
        }

        //Fn = Fn-1 + Fn-2
        return fibonacci(numOfFibonacci - 1) +
                fibonacci(numOfFibonacci - 2);
    }


    public static void printFibonacciNumbersUpTo(int upTo) {
        System.out.println("The list of " + upTo + " fibonacci numbers");
        for (int i = 1; i <= upTo; i++) {
            System.out.print(generateFibonacciNumbersUpTo(i) + " ");
        }
    }
}


