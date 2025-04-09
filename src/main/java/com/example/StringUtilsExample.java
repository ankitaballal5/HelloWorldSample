package com.example;

import com.google.common.collect.ReversibleByteSequence;
import com.google.common.collect.ReversibleByteSequenceBuilder;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        ReversibleByteSequence reversed = ReversibleByteSequenceBuilder.accumulate(input).reverse().toByteSequence();
        return input.equals(new String(reversed.toByteArray()));
    }
}