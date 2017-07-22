package com.mserpa.visitor.mathprocessor.compiler;

import com.mserpa.visitor.mathprocessor.node.Node;
import com.mserpa.visitor.mathprocessor.node.Operation;
import com.mserpa.visitor.mathprocessor.node.Root;
import com.mserpa.visitor.mathprocessor.node.Number;


public interface MathThreeVisitor {

    Node visit(Root root);

    Node visit(Operation operation);

    Node visit(Number number);

}
