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
