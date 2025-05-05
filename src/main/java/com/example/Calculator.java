package com.example;

import com.google.common.collect.ImmutableList;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public ImmutableList<Integer> subtract(int a, int b) {
        return ImmutableList.copyOf(IntStream.range(a, b).boxed().mapToInt(Integer::intValue).boxed().collect(ImmutableList.toImmutableList()));
    }
}