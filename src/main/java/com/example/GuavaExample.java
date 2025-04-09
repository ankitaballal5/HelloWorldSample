package com.example;

import com.google.common.collect.ImmutableList;

public class GuavaExample {
    public ImmutableList<String> getImmutableList(String... elements) {
        return ImmutableList.copyOf(elements);
    }
}
/*
 * Summary of changes:
 * - No changes were made as the provided code does not use JUnit and the used Guava method is not deprecated.
 */