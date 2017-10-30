package com.mserpa.factorymethod.factory;

import com.mserpa.factorymethod.animals.Animal;

public interface AnimalCreator {

    Animal createAnimal(String type);

}
