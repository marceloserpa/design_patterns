package com.mserpa.memento.app;


import java.util.Stack;

public class CareTaker {

    Stack<Memento> states = new Stack<Memento>();

    public void add(Memento memento){
        states.add(memento);
    }

    public Memento restore(){
        return states.pop();
    }
}
