package com.mserpa.shallowcopy;


public abstract class Prototype implements Cloneable{

    @Override
    public abstract Object clone() throws CloneNotSupportedException;

}
