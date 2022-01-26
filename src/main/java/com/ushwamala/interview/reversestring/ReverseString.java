package com.ushwamala.interview.reversestring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Who am I?"));
    }


    public static String reverseString(String word) {
        char[] chars = word.toCharArray();
        List<Character> reversedList = new ArrayList<>();
        for (char c : chars) {
            reversedList.add(c);
        }
        Collections.reverse(reversedList);
        StringBuilder sb = new StringBuilder();
        for (char c : reversedList) {
            sb.append(c);
        }
        return sb.toString();
    }
}
