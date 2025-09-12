package com.example;

import org.apache.commons.lang3.StringUtils;

public class GreetingService {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}

// Upgrade to Apache Commons Lang 3.18.0 to fix CVE-2025-48924 vulnerability
// Undeprecate newly deprecating methods in StringUtils and expose Strings.CI and Strings.CS
// through $stringsutils.ci and $stringutils.cs

// Update the dependency version in the pom.xml file (if using Maven)
// or the equivalent file for the build tool being used
// For example, in pom.xml:
// <dependency>
//     <groupId>org.apache.commons</groupId>
//     <artifactId>commons-lang3</artifactId>
//     <version>3.18.0</version>
// </dependency>