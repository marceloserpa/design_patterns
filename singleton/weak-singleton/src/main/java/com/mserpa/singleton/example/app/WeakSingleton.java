package com.mserpa.singleton.example.app;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class WeakSingleton {

    private volatile static Reference<WeakSingleton> reference;

    private WeakSingleton() { }

    public static WeakSingleton getInstance() {
        if (reference == null || reference.get() == null) {
            synchronized (WeakSingleton.class) {
                if (reference == null || reference.get() == null) {
                    WeakSingleton weakSingleton = new WeakSingleton();
                    reference = new WeakReference<WeakSingleton>(weakSingleton);
                }
            }
        }
        return reference.get();
    }

    public static void clear(){
        reference.clear();
    }
}