package com.example;

import com.google.common.collect.ServiceLoader;
import org.apache.commons.lang3.StringUtils;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}