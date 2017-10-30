package com.mserpa.factorymethod;

import com.mserpa.factorymethod.animals.Animal;
import com.mserpa.factorymethod.factory.AnimalCreator;
import com.mserpa.factorymethod.factory.AnimalCreatorFactory;

public class Main {

    public static void main(String[] args) {

        AnimalCreator creator = new AnimalCreatorFactory();

        Animal cat = creator.createAnimal("C");
        System.out.println("Cat make " + cat.makeNoise() + " and can fly is " + cat.canFly());

        Animal duck = creator.createAnimal("D");
        System.out.println("Duck make " + duck.makeNoise() + " and can fly is " + duck.canFly());
    }
}
