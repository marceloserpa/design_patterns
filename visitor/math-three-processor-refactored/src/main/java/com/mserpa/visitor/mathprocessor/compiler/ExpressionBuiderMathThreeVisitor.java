package com.mserpa.visitor.mathprocessor.compiler;


import com.mserpa.visitor.mathprocessor.node.Node;
import com.mserpa.visitor.mathprocessor.node.Number;
import com.mserpa.visitor.mathprocessor.node.Operation;
import com.mserpa.visitor.mathprocessor.node.Root;

public class ExpressionBuiderMathThreeVisitor implements MathThreeVisitor{

    @Override
    public Node visit(Root root) {
        Node left = root.getLeft();
        return left instanceof Number
                ? visit((Number) left)
                : visit((Operation) left);
    }

    @Override
    public Node visit(Operation operation) {

        Node totalLeft = null;
        Node totalRight = null;

        if(operation.getLeft() instanceof Operation){
            totalLeft = visit((Operation) operation.getLeft());
        } else if(operation.getLeft() instanceof Number){
            totalLeft = operation.getLeft();
        }

        if(operation.getRight() instanceof Operation){
            totalRight = visit((Operation) operation.getRight());
        } else if(operation.getRight() instanceof Number){
            totalRight = operation.getRight();
        }

        String expression = String.format("(%s %s %s)", totalLeft.getValue(), operation.getValue(), totalRight.getValue());
        return new Number(expression);

    }

    @Override
    public Node visit(Number number) {
        return number;
    }

}
