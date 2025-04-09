package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingServiceTest {
    @Test
    public void testGreet() {
        GreetingService service = new GreetingService();
        assertEquals("Hello, John!", service.greet("John"));
    }
}
// No changes were made to the code as it does not use any deprecated methods from the commons-lang3 library or Guava.
// The code remains the same, but the Guava dependency should be updated to the latest version in the project's build configuration file.