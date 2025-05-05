package com.example;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.stream.IntStream;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        Builder<Character> builder = ImmutableList.builder();
        IntStream.range(0, input.length()).forEach(i -> builder.add(input.charAt(i)));
        ImmutableList<Character> chars = builder.build();
        ImmutableList<Character> reversed = chars.reverse();
        return chars.equals(reversed);
    }
}