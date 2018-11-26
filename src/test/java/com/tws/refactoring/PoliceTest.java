package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {

    @Test
    void checkDriverAdult() {
        assertTrue(new Police().isDriverAdult(new Driver(18)));
        assertFalse(new Police().isDriverAdult(new Driver(17)));
    }
}