package com.mserpa.visitor.mathprocessor.node;


import com.mserpa.visitor.mathprocessor.compiler.MathThreeVisitor;

public class Number extends Node{

    public Number(String value) {
        super(value, null, null);
    }

    @Override
    public Node accept(MathThreeVisitor mathThreeVisitor) {
        return mathThreeVisitor.visit(this);
    }
}
