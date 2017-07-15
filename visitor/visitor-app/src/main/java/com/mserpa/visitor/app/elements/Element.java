package com.mserpa.visitor.app.elements;


import com.mserpa.visitor.app.visitors.Visitor;

public interface Element {

    void accept(Visitor visitor);

}
