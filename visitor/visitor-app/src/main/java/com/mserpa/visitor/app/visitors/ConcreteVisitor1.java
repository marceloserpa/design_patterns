package com.mserpa.visitor.app.visitors;


import com.mserpa.visitor.app.elements.ConcreteElementA;
import com.mserpa.visitor.app.elements.ConcreteElementB;

public class ConcreteVisitor1 implements Visitor{

    @Override
    public void visitConcreteElementA(ConcreteElementA e) {
        System.out.println("ConcreteVisitor1: " + e.getNumber());
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB e) {
       // Do nothing
    }

}
