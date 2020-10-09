package com.tdljava.controlflow.datatypes;

import com.tdljava.core.MessageService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ByteTest {

    @DisplayName("Test get a byte value of zero")
    @Test
    void testGet() {
        assertEquals(0, ByteValue.getZero());
    }

    @DisplayName("Test get a max byte value of 127")
    @Test
    void testGetMaxValue() {
        assertEquals(127, ByteValue.getMaxValue());
    }

    @DisplayName("Test get a min byte value of -128")
    @Test
    void testGetMinValue() {
        assertEquals(-128, ByteValue.getMinValue());
    }

}
