package com.mserpa.singleton.example.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class EagerInitializationTest {

    @Test
    public void isTheSameInstance() {
        EagerInitialization instance1 = EagerInitialization.getInstance();

        EagerInitialization instance2 = EagerInitialization.getInstance();

        assertEquals(instance1, instance2);

    }

}