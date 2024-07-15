package com.pdi.citest.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestControllerTest {

    @InjectMocks
    TestController testController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetString() {
        String result = testController.getString();

        assertEquals("This is a test", result);
    }

    @Test
    void testGetValue() {
        Long result = testController.getValue();

        assertEquals(3000L, result);
    }
}