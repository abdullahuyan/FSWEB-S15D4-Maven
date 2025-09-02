package org.example;


import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String input) {

        String newInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ENGLISH);

        String reverse = new StringBuilder(newInput).reverse().toString();



        if (newInput.equals(reverse)) {
            return true;
        } else return false;


    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        int n = number;

        while (n > 0) {
            int remainder = n % 2;
            stack.push(remainder);
            n = n / 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}


