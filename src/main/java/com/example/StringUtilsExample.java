package com.example;

import org.apache.commons.lang3.StringUtils;
import java.nio.CharBuffer;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        CharBuffer charBuffer = CharBuffer.wrap(input.toCharArray());
        charBuffer.reverse();
        String reversed = charBuffer.toString();
        return input.equals(reversed);
    }
}