package com.mserpa.visitor.mathprocessor.node;


import com.mserpa.visitor.mathprocessor.compiler.MathThreeVisitor;

public class Operation extends Node {

    public Operation(String value, Node left, Node right) {
        super(value, left, right);
    }

    @Override
    public Node accept(MathThreeVisitor mathThreeVisitor) {
        return mathThreeVisitor.visit(this);
    }

}
