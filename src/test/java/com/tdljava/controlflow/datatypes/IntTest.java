package com.tdljava.controlflow.datatypes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntTest {

    @DisplayName("Test get a int value of zero")
    @Test
    void testGet() {
        assertEquals(0, IntValue.getZero());
    }

    //-2,147,483,648 to 2147483647
    @DisplayName("Test get a max int value of 2,147,483,647")
    @Test
    void testGetMaxValue() {
        assertEquals(2147483647, IntValue.getMaxValue());
    }

    @DisplayName("Test get a min int value of -2,147,483,648")
    @Test
    void testGetMinValue() {
        assertEquals(-2147483648, IntValue.getMinValue());
    }

}
