package com.example;

import com.google.common.collect.ImmutableList;

public class App {
    public static void main(String[] args) {
        ImmutableList<String> list = ImmutableList.of("Hello", "World!");
        System.out.println(list.toString());
    }
}