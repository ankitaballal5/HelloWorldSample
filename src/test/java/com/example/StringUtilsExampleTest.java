package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringUtilsExampleTest {
    @Test
    public void testIsPalindrome() {
        StringUtilsExample example = new StringUtilsExample();
        assertTrue(example.isPalindrome("madam"));
        assertFalse(example.isPalindrome("hello"));
    }
}
/*
 * Changes:
 * - Updated import statements to use JUnit 5 packages.
 * - Replaced @Test annotation with JUnit 5 equivalent.
 * - Updated assertTrue and assertFalse methods to JUnit 5 equivalents.
 * - No changes needed for commons-lang3 library upgrade.
 * - No changes needed for Guava library upgrade.
 */
