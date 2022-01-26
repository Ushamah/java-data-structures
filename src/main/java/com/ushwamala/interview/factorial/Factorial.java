package com.ushwamala.interview.factorial;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }

    public static int factorial(int number){
        if(number == 0){
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static int fact(int number){
        int result = 1;
        while(number != 0){
            result *= number;
            number--;
        }
        return result;
    }
}
