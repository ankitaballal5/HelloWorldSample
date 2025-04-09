package com.example;

import java.util.Formatter;
import java.lang.String;

public class GreetingService {
    public String greet(String name) {
        return String.format("Hello, %s!", name);
    }
}