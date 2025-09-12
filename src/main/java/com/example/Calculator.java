package com.example;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

import java.util.List;
import java.util.Map;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

// Comment block summarizing changes:
// - Added dependency on Guava 33.4.8 using Maven.
// - Imported necessary Guava classes.
// - Used Guava Beta Checker to ensure no @Beta APIs are used.
// - No changes were made to the code as it did not contain any deprecated methods or usages.