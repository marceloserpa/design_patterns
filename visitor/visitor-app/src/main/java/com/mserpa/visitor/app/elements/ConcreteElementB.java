package com.mserpa.visitor.app.elements;


import com.mserpa.visitor.app.visitors.Visitor;

public class ConcreteElementB implements  Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public String getHello(){
        return "Hello World";
    }
}
