package com.example;

import com.google.common.base.Strings;
import com.google.common.collect.CollectUtils;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (input == null || CollectUtils.isEmpty(input)) {
            return false;
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}