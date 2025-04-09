package com.example;

import java.util.Formatter;
import java.lang.String;

public class GreetingService {
    public String greet(String name) {
        Formatter formatter = new Formatter();
        return formatter.format("Hello, %s!", name).toString();
    }
}