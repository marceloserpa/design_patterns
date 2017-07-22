package com.mserpa.visitor.mathprocessor;

import com.mserpa.visitor.mathprocessor.compiler.CalculatorMathThreeVisitor;
import com.mserpa.visitor.mathprocessor.node.Node;
import com.mserpa.visitor.mathprocessor.node.Root;


public class MathThreeProcessor {

    public Double calculate(Root root){
        CalculatorMathThreeVisitor calculatorMathThreeVisitor = new CalculatorMathThreeVisitor();
        Node result = root.accept(calculatorMathThreeVisitor);
        return Double.valueOf(result.getValue());
    }

}
