package com.mserpa.visitor.app.visitors;


import com.mserpa.visitor.app.elements.ConcreteElementA;
import com.mserpa.visitor.app.elements.ConcreteElementB;

public class ConcreteVisitor2 implements Visitor{

    @Override
    public void visitConcreteElementA(ConcreteElementA e) {
        // Do nothing
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB e) {
        System.out.println("ConcreteVisitor2: " + e.getHello());
    }

}
