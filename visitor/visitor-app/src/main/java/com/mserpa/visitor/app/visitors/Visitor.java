package com.mserpa.visitor.app.visitors;


import com.mserpa.visitor.app.elements.ConcreteElementA;
import com.mserpa.visitor.app.elements.ConcreteElementB;

public interface Visitor {

    void visitConcreteElementA(ConcreteElementA e);

    void visitConcreteElementB(ConcreteElementB e);

}
