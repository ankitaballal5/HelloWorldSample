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
/*
 * No changes were made as the code does not use any deprecated methods from the commons-lang3 library or the Guava library.
 */