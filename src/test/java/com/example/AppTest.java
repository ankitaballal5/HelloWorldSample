package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testApp() {
        assertEquals("Hello, World!", "Hello, World!");
    }
}
/*
 * Changes:
 * - Updated import statements to use JUnit 5 annotations and assertions.
 * - Replaced @Test annotation from org.junit.Test to org.junit.jupiter.api.Test.
 * - Replaced org.junit.Assert.assertEquals with org.junit.jupiter.api.Assertions.assertEquals.
 * - No changes needed due to commons-lang3 library upgrade.
 * - No changes needed due to Guava library upgrade.
 */
