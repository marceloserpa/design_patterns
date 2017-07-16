package com.mserpa.visitor.mathprocessor;


import com.mserpa.visitor.mathprocessor.node.Number;
import com.mserpa.visitor.mathprocessor.node.Operation;
import com.mserpa.visitor.mathprocessor.node.Root;

public class App {

    public static void main(String[] args) {

        Number n1 = new Number("8");
        Number n2 = new Number("2");
        Operation op1 = new Operation("*", n1, n2);

        Number n3 = new Number("5");

        Operation op2 = new Operation("+", n3, op1);

        Root root = new Root(op2);

        ParseTree treeCalc = new ParseTree();
        System.out.println(treeCalc.calc(root));

    }

}
