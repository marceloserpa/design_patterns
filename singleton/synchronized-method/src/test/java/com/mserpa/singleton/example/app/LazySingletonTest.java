package com.mserpa.singleton.example.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class LazySingletonTest {

    @Test
    public void getInstance() {
        // Given
        LazySingleton i1 = LazySingleton.getInstance();

        // When
        LazySingleton i2 = LazySingleton.getInstance();

        // Then (check if is the same instance :)
        assertEquals(i2, i1);

    }

}