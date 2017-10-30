package com.mserpa.factorymethod.factory;


import com.mserpa.factorymethod.animals.Animal;
import com.mserpa.factorymethod.animals.Cat;
import com.mserpa.factorymethod.animals.Duck;

public class AnimalCreatorFactory implements AnimalCreator{

    @Override
    public Animal createAnimal(String type) {
        switch (type){
            case "C": return new Cat();
            case "D": return new Duck();
            default: throw new IllegalArgumentException("invalid type");
        }
    }

}
