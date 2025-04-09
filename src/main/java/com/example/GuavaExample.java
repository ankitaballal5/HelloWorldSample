package com.example;

import java.util.List;

public class GuavaExample {
    public List<String> getImmutableList(String... elements) {
        return java.util.Arrays.asList(elements);
    }
}