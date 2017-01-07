package br.com.mserpa.singleton.eagerlyinit;

import br.com.mserpa.singleton.eagerlyinit.EagerlyInitializationSingleton;
import org.junit.Test;


public class EagerlyInitializationSingletonTest {

    @Test
    public void getInstance(){
        EagerlyInitializationSingleton instance = EagerlyInitializationSingleton.getInstance();
    }

}