package com.mserpa.visitor.mathprocessor.compiler;

import com.mserpa.visitor.mathprocessor.node.Node;
import com.mserpa.visitor.mathprocessor.node.Number;
import com.mserpa.visitor.mathprocessor.node.Operation;
import com.mserpa.visitor.mathprocessor.node.Root;

public class CalculatorMathThreeVisitor implements MathThreeVisitor{

    @Override
    public Node visit(Root root) {
        Node left = root.getLeft();
        Node resultL = left instanceof Number ? visit((Number)left) : visit((Operation) left);
        return resultL;
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

        if("*".equals(expression)){
            return new Number(String.valueOf(nLeft * nRight));
        } else if("+".equals(expression)){
            return new Number(String.valueOf(nLeft + nRight));
        } else if("-".equals(expression)){
            return new Number(String.valueOf(nLeft - nRight));
        } else if("/".equals(expression)){
            return new Number(String.valueOf(nLeft / nRight));
        }
        return null;
    }

    @Override
    public Node visit(Number number) {
        return number;
    }


    /**
    public Double calc(Number number){
        return Double.valueOf(number.getValue());
    }

    public Double calc(Root root){
        Node left = root.getLeft();
        Double resultL = left instanceof Number ? calc((Number)left) : calc((Operation) left);
        return resultL;
    }

    public Double calc(Operation operation){
        String expression = operation.getValue();

        Double totalLeft = null;
        Double totalRight = null;

        if(operation.getLeft() instanceof Operation){
            totalLeft = calc((Operation) operation.getLeft());
        } else if(operation.getLeft() instanceof Number){
            totalLeft = Double.valueOf(operation.getLeft().getValue());
        }

        if(operation.getRight() instanceof Operation){
            totalRight = calc((Operation) operation.getRight());
        } else if(operation.getRight() instanceof Number){
            totalRight = Double.valueOf(operation.getRight().getValue());
        }

        if("*".equals(expression)){
            return totalLeft * totalRight;
        } else if("+".equals(expression)){
            return totalLeft + totalRight;
        } else if("-".equals(expression)){
            return totalLeft - totalRight;
        } else if("/".equals(expression)){
            return totalLeft / totalRight;
        }

        return 0D;
    }**/

}
