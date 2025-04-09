package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingServiceTest {
    @Test
    public void testGreet() {
        GreetingService service = new GreetingService();
        assertEquals("Hello, John!", service.greet("John"));
    }
}
/*
 * Changes:
 * - Updated import statements to use JUnit 5 annotations and assertions.
 * - Replaced JUnit 4 @Test annotation with JUnit 5 @Test annotation.
 * - Replaced JUnit 4 assertEquals with JUnit 5 assertEquals.
 * - No changes were made due to the commons-lang3 library upgrade, as the code does not use any deprecated methods from this library.
 * - No changes were made due to the Guava library upgrade, as the code does not use any Guava methods or classes.
 */