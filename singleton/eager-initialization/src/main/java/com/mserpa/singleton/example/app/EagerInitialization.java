package com.mserpa.singleton.example.app;


public class EagerInitialization {

    private volatile static EagerInitialization INSTANCE = new EagerInitialization();

    private EagerInitialization() { }

    public static EagerInitialization getInstance(){
        return INSTANCE;
    }

}
