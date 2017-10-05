package com.mserpa.singleton.example.app;

public class SingletonHolder {

    private SingletonHolder() { }

    private static class StaticHolder {
        static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getSingleton() {
        return StaticHolder.INSTANCE;
    }

}
