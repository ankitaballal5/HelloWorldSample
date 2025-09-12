package com.example;

import org.apache.commons.lang3.StringUtils;
import com.google.common.base.Preconditions;

public class Calculator {
    public int add(int a, int b) {
        Preconditions.checkNotNull(a, "a must not be null");
        Preconditions.checkNotNull(b, "b must not be null");
        return a + b;
    }

    public int subtract(int a, int b) {
        Preconditions.checkNotNull(a, "a must not be null");
        Preconditions.checkNotNull(b, "b must not be null");
        return a - b;
    }
}

// Added import statement for Guava
// Added null checks using Preconditions.checkNotNull from Guava