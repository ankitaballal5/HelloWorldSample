package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.google.common.collect.ImmutableList;

public class GuavaExampleTest {
    @Test
    public void testGetImmutableList() {
        GuavaExample example = new GuavaExample();
        ImmutableList<String> list = example.getImmutableList("a", "b", "c");
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
    }
}
/*
 * Changes made:
 * - No changes were made due to the upgrade of the Guava library to 33.4.0-jre, as the provided code does not contain any deprecated methods or usages.
 * - Replaced import org.junit.Test with org.junit.jupiter.api.Test
 * - Replaced import static org.junit.Assert.assertEquals with import static org.junit.jupiter.api.Assertions.assertEquals
 * - Updated @Test annotation to use org.junit.jupiter.api.Test
 * No changes were made due to the upgrade of the commons-lang3 library, as it was not being used in the provided code.
 */