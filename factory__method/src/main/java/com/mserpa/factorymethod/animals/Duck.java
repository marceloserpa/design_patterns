package com.mserpa.factorymethod.animals;

public class Duck implements Animal {

    @Override
    public Boolean canFly() {
        return true;
    }

    @Override
    public String makeNoise() {
        return "Quack!";
    }

}
