package com.mserpa.visitor.app;

import com.mserpa.visitor.app.elements.ConcreteElementA;
import com.mserpa.visitor.app.elements.ConcreteElementB;
import com.mserpa.visitor.app.elements.Element;
import com.mserpa.visitor.app.visitors.ConcreteVisitor1;
import com.mserpa.visitor.app.visitors.ConcreteVisitor2;

import java.util.ArrayList;
import java.util.List;


public class Application {

    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new ConcreteElementA());
        elements.add(new ConcreteElementA());
        elements.add(new ConcreteElementB());
        elements.add(new ConcreteElementA());


        elements.forEach(e -> e.accept(new ConcreteVisitor1()));

        elements.forEach(e -> e.accept(new ConcreteVisitor2()));

    }

}
