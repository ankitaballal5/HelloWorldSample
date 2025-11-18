package com.example;

import org.apache.commons.text.StringTokenizer;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        StringTokenizer tokenizer = new StringTokenizer(input);
        String reversed = "";
        while (tokenizer.hasMoreTokens()) {
            reversed = tokenizer.nextToken() + reversed;
        }
        return input.equals(reversed);
    }
}

// Changed: Replaced StringUtils.reverse() with StringTokenizer to reverse the string.
// Changed: Replaced StringUtils.isEmpty() with input.isEmpty() to check for empty string.
// Changed: Added import for StringTokenizer class.