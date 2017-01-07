package br.com.mserpa.singleton.lazyinitwithdoublelock;

import org.junit.Test;

import static org.junit.Assert.*;

public class LazyInitWithDoubleLockTest {

    @Test
    public void shouldReturnInstanceOfClass() {
        // Given
        LazyInitWithDoubleLock instance = null;

        // When
        instance = LazyInitWithDoubleLock.getInstance();

        // Then
        assertNotNull(instance);
    }

    @Test
    public void shouldReturnSameInstanceOfClass() {
        // Given
        LazyInitWithDoubleLock instance = LazyInitWithDoubleLock.getInstance();

        // When
        LazyInitWithDoubleLock sameInstance = LazyInitWithDoubleLock.getInstance();

        // Then
        assertEquals(instance, sameInstance);
    }

}