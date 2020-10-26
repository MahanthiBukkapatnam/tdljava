package com.tdljava.controlflow.datatypes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongTest {

    @DisplayName("Test get a long value of zero")
    @Test
    void testGet() {
        assertEquals(0, LongValue.getZero());
    }

    @DisplayName("Test get a max long value of 32767")
    @Test
    void testGetMaxValue() {
        assertEquals(9223372036854775807L, LongValue.getMaxValue());
    }

    @DisplayName("Test get a min long value of -32,768")
    @Test
    void testGetMinValue() {
        assertEquals(-9223372036854775808L, LongValue.getMinValue());
    }

}
