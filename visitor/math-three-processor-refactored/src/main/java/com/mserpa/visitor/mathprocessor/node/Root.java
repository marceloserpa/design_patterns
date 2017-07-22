package com.mserpa.visitor.mathprocessor.node;

import com.mserpa.visitor.mathprocessor.compiler.MathThreeVisitor;

public class Root extends Node{

    public Root(Node left) {
        super(null, left, null);
    }

    @Override
    public Node accept(MathThreeVisitor mathThreeVisitor) {
        return mathThreeVisitor.visit(this);
    }
}
