package br.com.mserpa.singleton.lazyinitwithdoublelock;

public class LazyInitWithDoubleLock {

    private volatile static LazyInitWithDoubleLock instance;

    private LazyInitWithDoubleLock(){

    }

    public static LazyInitWithDoubleLock getInstance(){
        if(instance == null){
            synchronized (LazyInitWithDoubleLock.class){
                if(instance == null){
                    instance = new LazyInitWithDoubleLock();
                }
            }
        }
        return instance;
    }

}
