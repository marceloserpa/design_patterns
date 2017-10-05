package com.mserpa.singleton.example.app;

import org.junit.Test;

import static org.junit.Assert.*;


public class LazySingletonTest {

    @Test
    public void isTheSameInstance(){
        // Given
        LazySingleton instance1 = LazySingleton.getInstance();

        // When
        LazySingleton instance2 = LazySingleton.getInstance();

        //Then
        assertEquals(instance2, instance1);
    }

}