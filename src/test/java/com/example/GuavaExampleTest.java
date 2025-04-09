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
// No changes needed as the code does not use any deprecated methods from commons-lang3 library.
// The code is already using the recommended JUnit 5 (Jupiter) version.
// The Guava dependency has been upgraded to the latest version, which is 33.4.0-jre, but no code changes were required.