package com.mserpa.pccomponents.app.interfaces;

import java.util.Iterator;


public abstract class Equipament {

    private String name;

    public Equipament(String name){
        this.name = name;
    }

    public abstract Long power();

    public abstract Long netPrice();

    void add(Equipament equipament){

    }

    void remove(Equipament equipament){

    }

    Iterator<Equipament> createIterator(){
        return null;
    }

}
