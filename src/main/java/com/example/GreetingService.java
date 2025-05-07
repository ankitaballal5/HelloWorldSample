package com.example;

import org.apache.commons.lang3.StringUtils;

public class GreetingService {
    public String greet(String name) {
        return String.format("Hello, %s!", name);
    }
}