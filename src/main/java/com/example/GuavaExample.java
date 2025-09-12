package com.example;

import java.util.StringJoiner;

public class GuavaExample {
    public String getImmutableListString(String... elements) {
        StringJoiner joiner = new StringJoiner(", ");
        for (String element : elements) {
            joiner.add(element);
        }
        return joiner.toString();
    }
}

// Removed unnecessary import and method call
// Removed unnecessary import of StringUtils