package com.example;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.primitives.Reversed;

import java.util.List;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (Strings.isNullOrEmpty(input)) {
            return false;
        }
        List<Character> characters = Lists.charactersOf(input);
        List<Character> reversed = Reversed.asList(characters);
        return input.equals(String.valueOf(reversed));
    }
}