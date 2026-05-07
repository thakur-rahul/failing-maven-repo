package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FailingTest {

    @Test
    void testAlwaysFails() {
        assertEquals(1, 2, "This test will always fail");
    }

    @Test
    void testNullPointer() {
        String str = null;
        // This will throw NullPointerException
        assertEquals("hello", str.toLowerCase());
    }
}
