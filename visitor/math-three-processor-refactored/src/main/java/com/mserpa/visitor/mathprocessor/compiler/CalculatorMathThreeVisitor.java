package com.mserpa.visitor.mathprocessor.compiler;

import com.mserpa.visitor.mathprocessor.node.Node;
import com.mserpa.visitor.mathprocessor.node.Number;
import com.mserpa.visitor.mathprocessor.node.Operation;
import com.mserpa.visitor.mathprocessor.node.Root;

public class CalculatorMathThreeVisitor implements MathThreeVisitor{

    @Override
    public Node visit(Root root) {
        Node left = root.getLeft();
        return left instanceof Number
            ? visit((Number) left)
            : visit((Operation) left);
    }

    @Override
    public Node visit(Operation operation) {
        String expression = operation.getValue();

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

        Double nLeft = Double.valueOf(totalLeft.getValue());
        Double nRight = Double.valueOf(totalRight.getValue());

        return toNumberNode(calculate(expression, nLeft, nRight));
    }

    public Double calculate(String expression, Double number1, Double number2) {
        if("*".equals(expression)){
            return number1 * number2;
        } else if("+".equals(expression)){
            return number1 + number2;
        } else if("-".equals(expression)){
            return number1 - number2;
        } else if("/".equals(expression)){
            return number1 / number2;
        }
        return null;
    }

    public Number toNumberNode(Double value){
        return new Number(String.valueOf(value));
    }

    @Override
    public Node visit(Number number) {
        return number;
    }

}
