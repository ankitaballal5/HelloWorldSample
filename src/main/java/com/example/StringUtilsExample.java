package com.example;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (StringUtils.isEmpty(input)) {
            return false;
        }
        String reversed = StringUtils.reverse(input);
        return input.equals(reversed);
    }
}
// No changes were made as the code does not utilize the Guava library. It uses the Apache Commons Lang library.