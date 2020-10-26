package com.tdljava.controlflow.datatypes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooleanTest {

    @DisplayName("Test get a true value")
    @Test
    void testGetTrue() {
        assertEquals(true, BooleanValue.getTrue());
    }

    @DisplayName("Test get a false value")
    @Test
    void testGetFalse() {
        assertEquals(false, BooleanValue.getFalse());
    }

}
