package com.example;

import org.apache.commons.text.StringTokenizer;
import java.util.StringBuilder;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        return input.equals(reversed.toString());
    }
}

// Changed the StringUtils.reverse() method to use StringBuilder.reverse() for string reversal.
// Removed the unnecessary import of org.apache.commons.lang3.StringUtils.
// Added a null check for the input string to handle potential NullPointerExceptions.