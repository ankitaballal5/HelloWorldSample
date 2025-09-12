package com.example;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

/*
 * Changes:
 * - Added import statements for Guava.
 * - Updated the dependency in the Maven project file to use Guava 33.4.8.
 * - Added a comment block summarizing the changes.
 */