package com.example;

import org.apache.commons.text.StringReverseUtils;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (org.apache.commons.text.StringTokenizer.EMPTY_STRING.equals(input)) {
            return false;
        }
        String reversed = StringReverseUtils.reverse(input);
        return input.equals(reversed);
    }
}

// Changed methods: 
// - Replaced StringUtils.isEmpty() with org.apache.commons.text.StringTokenizer.EMPTY_STRING.equals()
// - Replaced StringUtils.reverse() with StringReverseUtils.reverse()