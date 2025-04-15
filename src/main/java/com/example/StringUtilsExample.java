package com.example;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (Strings.isNullOrEmpty(input)) {
            return false;
        }
        String reversed = Splitter.onChar(Character.valueOf('\n')).reverse().join(input);
        return input.equals(reversed);
    }
}