package com.example;

import com.google.common.base.Strings;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (Strings.isNullOrEmpty(input)) {
            return false;
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}

// Changed: Replaced Apache Commons Lang with Guava for string utility methods
// Changed: Replaced Strings.isEmpty() with Strings.isNullOrEmpty() for more efficient null check
// Added: Import for Guava's Strings class
// Added: Comment block summarizing changes
// Removed: Unused import for Apache Commons Lang's Strings alias
// Removed: Unused comment block summarizing previous changes