package com.example;

import java.util.regex.Pattern;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        char[] chars = input.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }
        return input.equals(new String(reversed));
    }
}