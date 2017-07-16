package com.mserpa.visitor.mathprocessor;


import com.mserpa.visitor.mathprocessor.node.Node;
import com.mserpa.visitor.mathprocessor.node.Number;
import com.mserpa.visitor.mathprocessor.node.Operation;
import com.mserpa.visitor.mathprocessor.node.Root;

public class ParseTree {

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
    }

}
