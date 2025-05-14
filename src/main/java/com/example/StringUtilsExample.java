package com.example;

import org.apache.commons.lang3.StringUtils;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (StringUtils.isBlank(input)) {
            return false;
        }
        String reversed = IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(i))
                .map(String::valueOf)
                .collect(Collectors.joining())
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        return input.equals(reversed);
    }
}