package com.example;

import com.google.common.primitives.Ints;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return Ints.difference(a, b).intValue();
    }
}