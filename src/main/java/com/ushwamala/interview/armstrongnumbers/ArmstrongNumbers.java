package com.ushwamala.interview.armstrongnumbers;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(isOrIsNotArmstrongNumber(153));

    }

    public static boolean isArmstrongNumber(String number) {
        if (number.length() < 2) {
            return false;
        }

        int num = Integer.parseInt(number);
        if (num == 0) {
            return false;
        }

        final char[] chars = number.toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum = (Character.getNumericValue(c) *
                    Character.getNumericValue(c) *
                    Character.getNumericValue(c)) + sum;
        }
        return sum == num;

    }

    public static boolean isOrIsNotArmstrongNumber(int number) {
        int remainder, temp, sum = 0;
        temp = number;
        while (number > 0) {
            remainder = number % 10;
            sum += (remainder * remainder * remainder);
            number = number / 10;
        }

        return temp == sum;
    }

}
