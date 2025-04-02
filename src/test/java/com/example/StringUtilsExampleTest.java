package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringUtilsExampleTest {
    @Test
    public void testIsPalindrome() {
        StringUtilsExample example = new StringUtilsExample();
        assertTrue(example.isPalindrome("madam"));
        assertFalse(example.isPalindrome("hello"));
    }
}
