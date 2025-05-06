package com.example;

import com.google.common.base.Strings;

public class GreetingService {
    public String greet(String name) {
        return String.format("Hello, %s!", Strings.nullToEmpty(name));
    }
}