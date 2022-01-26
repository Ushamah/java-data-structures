package com.ushwamala.interview.primenumbers;

import java.util.Scanner;

//Write a simple Java program to check if a given number is prime or not
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter up to which prime numbers should be calculated");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++){
            if(isPrimeOrNot(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        int sqrt = (int) (Math.sqrt(number) + 1);
        for (int i = 2; i < sqrt; i++) {
            //If the number is perfectly divisible, then it's not a prime number
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*Checks if a number is prime or not,
    with improvement like not checking for division by even number,
    if it's not divisible by 2*/
    public static boolean isPrimeNumber(int number) {
        if (number == 2 || number == 3) {
            return true;
        }

        //improvement like not checking for division by even number
        if (number % 2 == 0) {
            return false;
        }

        int sqrt = (int) (Math.sqrt(number) + 1);

        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeOrNot(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }
        // (
        return (number * number - 1) % 24 == 0;
    }
}
