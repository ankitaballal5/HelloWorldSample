```java
package com.example;

import com.google.common.base.Preconditions;
import com.google.common.base.Preconditions.checkNotNull;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Objects.requireNonNull(args, "args is null");
        System.out.println("Hello, World!");
    }
}

// Changes:
// - Replaced com.google.common.base.Preconditions.checkNotNull() with Objects.requireNonNull()
// - Imported Objects class from java.util package
```