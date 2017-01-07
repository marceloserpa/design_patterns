package br.com.mserpa.singleton.lazyinit;

import org.junit.Test;

import static org.junit.Assert.*;

public class LazyInitSingletonTest {

    @Test
    public void getInstance(){
        LazyInitSingleton instance = LazyInitSingleton.getInstance();
    }

}