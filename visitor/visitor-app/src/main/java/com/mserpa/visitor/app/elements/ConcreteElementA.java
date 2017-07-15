package com.mserpa.visitor.app.elements;


import com.mserpa.visitor.app.visitors.Visitor;

public class ConcreteElementA implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public Integer getNumber(){
        return 34;
    }
}
