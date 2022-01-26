package com.ushwamala;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "yellow";
        colors[3] = "red";
        colors[4] = "green";

        /*System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);*/


        int[] numbers = {100, 200};
        for(int i: numbers)
        System.out.println(i);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        System.out.println();
        System.out.println("USING STREAMS");
        Arrays.stream(numbers).forEach(System.out::println);




    }
}
