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
 * - Added JUnit 5 test for the isPalindrome method.
 * - No changes were made to the original code as it does not use any deprecated JUnit methods.
 * - No changes were made as the code does not use any deprecated methods from the commons-lang3 library.
 * - No changes were made as the code does not use any Guava dependency.*/
