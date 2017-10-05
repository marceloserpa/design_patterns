package com.mserpa.singleton.example.app;

import org.junit.Test;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

import static org.junit.Assert.*;

public class WeakSingletonTest {

    @Test
    public void isTheSameInstance() {
        WeakSingleton instance1 = WeakSingleton.getInstance();

        WeakSingleton instance2 = WeakSingleton.getInstance();

        assertEquals(instance1, instance2);
    }

    @Test
    public void cleanWeakReference() {
        WeakSingleton instance1 = WeakSingleton.getInstance();

        WeakSingleton.clear();

        WeakSingleton instance2 = WeakSingleton.getInstance();

        assertNotEquals(instance1, instance2);
    }

}