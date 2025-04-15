package com.example;

import org.apache.commons.lang3.StringUtils;
import java.util.Objects;

public class GreetingService {
    public String greet(String name) {
        return "Hello, " + Objects.toString(name, "") + "!";
    }
}