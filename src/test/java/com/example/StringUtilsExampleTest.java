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
// No changes were made to this class as it does not directly use any deprecated methods.
// Changes should be made in the StringUtilsExample class if it uses any deprecated methods.
// For example, if the isPalindrome method in StringUtilsExample uses the deprecated StringUtils.equals() method, 
// it should be replaced with the recommended alternative, Objects.equals().
// Reminder: Update JUnit version to 4.13.2 or later in build configuration file (e.g., build.gradle or pom.xml)
// Comment: No code modifications were necessary in this class, but other classes using deprecated methods should be updated.
// Update JUnit version to 4.13.2 or later in build configuration file.