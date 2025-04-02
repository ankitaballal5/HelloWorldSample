package com.example;

import org.junit.Test;
import com.google.common.collect.ImmutableList;
import static org.junit.Assert.assertEquals;

public class GuavaExampleTest {
    @Test
    public void testGetImmutableList() {
        GuavaExample example = new GuavaExample();
        ImmutableList<String> list = example.getImmutableList("a", "b", "c");
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
    }
}
