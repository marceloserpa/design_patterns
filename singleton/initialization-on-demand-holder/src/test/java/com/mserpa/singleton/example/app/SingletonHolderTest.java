package com.mserpa.singleton.example.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonHolderTest {

    @Test
    public void isTheSameInstance(){
        SingletonHolder instance1 = SingletonHolder.getSingleton();

        SingletonHolder instance2 = SingletonHolder.getSingleton();

        assertEquals(instance1, instance2);
    }

}