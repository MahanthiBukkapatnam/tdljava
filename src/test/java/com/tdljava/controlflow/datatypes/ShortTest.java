package com.tdljava.controlflow.datatypes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortTest {

    @DisplayName("Test get a short value of zero")
    @Test
    void testGet() {
        assertEquals(0, ShortValue.getZero());
    }

    @DisplayName("Test get a max short value of 32767")
    @Test
    void testGetMaxValue() {
        assertEquals(32767, ShortValue.getMaxValue());
    }

    @DisplayName("Test get a min short value of -32,768")
    @Test
    void testGetMinValue() {
        assertEquals(-32768, ShortValue.getMinValue());
    }

}
