package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
    }
}
// No changes were made to the Java code as the update should be done in the build configuration file.
// To update the Guava dependency, modify the build.gradle file (if using Gradle) or pom.xml file (if using Maven) to use Guava 33.4.0-jre or a later version.
// No modifications were needed in the Java code due to the upgrade of the Guava library.