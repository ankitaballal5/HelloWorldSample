package com.example;

import org.apache.commons.lang3.StringUtils;
import com.google.common.base.Strings;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// Upgraded Guava to version 33.4.8
// Added dependency on Guava using Maven, specifying the version to be greater than 32.0.1
// Consider deferring the upgrade of Guava to give time to work through nullness errors
// Use the Guava Beta Checker to ensure that no `@Beta` APIs are used