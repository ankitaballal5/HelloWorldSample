package com.example;

import com.google.common.base.Strings;
import com.google.common.collect.Sets;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (Strings.isNullOrEmpty(input)) {
            return false;
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}