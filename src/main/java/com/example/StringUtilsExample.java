package com.example;

import org.apache.commons.lang3.StringUtils;
import java.lang.String;
import java.util.Arrays;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (String.valueOf(input).isBlank()) {
            return false;
        }
        char[] chars = input.toCharArray();
        Arrays.reverse(chars);
        String reversed = new String(chars);
        return input.equals(reversed);
    }
}