package com.example;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringTokenizer;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (StringUtils.isBlank(input)) {
            return false;
        }
        StringTokenizer tokenizer = new StringTokenizer(input);
        StringBuilder reversed = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            reversed.append(tokenizer.nextToken());
        }
        String reversedStr = reversed.reverse().toString();
        return input.equals(reversedStr);
    }
}