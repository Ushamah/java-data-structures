package com.ushwamala.interview.removeduplicates;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Integer[] nums = {1, 3, 4, 5, 5, 6, 2, 3, 45, 45, 45, 45, 45};
        String[] words = {"hi", "hi", " ", " ", "my", "my", " ", " ", "name", "name", " ", " ", "is ", "is ", "Ushamah",
                "Ushamah"};
        //  removeDuplicatesFromArray(words);

        System.out.println(squareRoot(45));

    }

    public static <T> void removeDuplicatesFromArray(T[] array) {
        Object[] result = new Object[array.length];
        if (array.length != 0) {
            result = Arrays.stream(array).distinct().toArray();
        }
        System.out.println(Arrays.toString(result));
    }

    public static int squareRoot(int num) {
        int result = 0;
        final int sqr = num * num;
        while (num > 0) {
            if (sqr / num != num) {
                result = sqr / num;
            } else if(sqr == num) {
                result = num;
                break;
            }

            num--;
        }
        return result;
    }
}
