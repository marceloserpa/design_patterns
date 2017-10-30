package com.mserpa.factorymethod.animals;

public class Cat implements Animal{

    @Override
    public Boolean canFly() {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Miau!";
    }
}
