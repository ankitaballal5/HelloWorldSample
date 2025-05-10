package com.example;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (StringUtils.isEmpty(input)) {
            return false;
        }
        String reversed = StringUtils.reverse(input);
        return input.equals(reversed);
    }

    @Test
    public void testIsPalindrome() {
        StringUtilsExample example = new StringUtilsExample();
        assertTrue(example.isPalindrome("radar"));
        assertFalse(example.isPalindrome("hello"));
    }
}

/*
 * Changes:
 * - No changes were made as the code is already using JUnit 5 and does not contain any deprecated methods related to Guava.
 */
