package com.example;

import com.google.common.math.IntMath;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return IntMath.subtractExact(a, b);
    }
}