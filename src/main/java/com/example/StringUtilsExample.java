package com.example;

import com.google.common.base.Strings;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (Strings.nullToEmpty(input).isEmpty()) {
            return false;
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
/*
 * Changes were made to the original code to replace Apache Commons Lang with Guava.
 * Replaced StringUtils.isEmpty with Strings.nullToEmpty(input).isEmpty() to check for empty strings.
 * Replaced StringUtils.reverse with new StringBuilder(input).reverse().toString() to reverse the string.
 */