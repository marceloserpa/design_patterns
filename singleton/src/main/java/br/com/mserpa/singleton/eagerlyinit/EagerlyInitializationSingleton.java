package br.com.mserpa.singleton.eagerlyinit;


public class EagerlyInitializationSingleton {

    private volatile static EagerlyInitializationSingleton instance = new EagerlyInitializationSingleton();

    private EagerlyInitializationSingleton(){

    }

    public static EagerlyInitializationSingleton getInstance(){
        return instance;
    }


}
