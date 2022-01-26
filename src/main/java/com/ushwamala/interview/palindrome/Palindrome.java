package com.ushwamala.interview.palindrome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        String[] words = {"mum", "nun", "mike", "dad", "pop", "ana", "lol", "121"};
        for (String word : words) {
            //final boolean wordIsPalindrome = isPalindrome(word);
            final boolean wordIsPalindrome = isOrIsNotPalindrome(word);
            if (wordIsPalindrome) {
                System.out.println(word + " is a palindrome");
            }
            else
                System.out.println(word + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String word) {
        //convert the word into an array of characters
        final char[] wordArray = word.toCharArray();

        //put the characters in the charArray into a List
        List<Character> wordList = new ArrayList<>();
        for (char c : wordArray) {
            wordList.add(c);
        }

        //Reverse the arrayList
        Collections.reverse(wordList);

        StringBuilder sb = new StringBuilder();
        //Put the reversed array into a stringBuilder
        // wordList.forEach(sb::append);
        for (char c : wordList) {
            sb.append(c);
        }
        String reversedWord = sb.toString();

        return reversedWord.equals(word);
    }

    public static boolean isOrIsNotPalindrome(String word) {
        return word.equals(reverse(word));
    }

    private static String reverse(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return word.charAt(word.length() - 1) + reverse(word.substring(0, word.length() - 1));
    }
}
