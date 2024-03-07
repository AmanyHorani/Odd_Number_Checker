package com.amany;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkNumbersIfOdd(13, 17));
        System.out.println(checkNumbersIfOdd("Cats", 12));
    }
    public static String checkNumbersIfOdd(Object arg1, Object arg2) {
        // Checks if both arguments are numbers
        if (!(arg1 instanceof Number) || !(arg2 instanceof  Number)) {
            return "False";
        }

        // Converting arguments to doubles
        double num1 = ((Number) arg1).doubleValue();
        double num2 = ((Number) arg2).doubleValue();

        // Checks if arguments are decimals because decimal numbers
        // are not odd or even
        if (num1 != Math.floor(num1) || num2 != Math.floor(num2)) {
            return "False"; // One or both arguments are decimals
        }

        // Converting arguments to integers
        int intNum1 = ((Number) arg1).intValue();
        int intNum2 = ((Number) arg2).intValue();

        // Checks if both numbers are odd
        // if this statement is true then both arguments are odd
        if (intNum1 % 2 != 0 && intNum2 % 2 != 0)
            return "Odd numbers!";
        else
            return "False";
    }
}