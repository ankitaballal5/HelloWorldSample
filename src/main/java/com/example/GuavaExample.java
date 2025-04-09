package com.example;

import com.google.common.collect.ImmutableList;

public class GuavaExample {
    public ImmutableList<String> getImmutableList(String... elements) {
        return ImmutableList.copyOf(elements);
    }
}
/*
 * No changes were made as the provided code does not use any deprecated methods 
 * from the Guava library. The code is already compatible with the given context.
 */