package com.mserpa.visitor.mathprocessor;

import com.mserpa.visitor.mathprocessor.node.Number;
import com.mserpa.visitor.mathprocessor.node.Operation;
import com.mserpa.visitor.mathprocessor.node.Root;
import org.junit.Test;

import static org.junit.Assert.*;


public class MathThreeProcessorTest {

    @Test
    public void shouldCalculateCorrectly() throws Exception {

        Number n1 = new Number("8");
        Number n2 = new Number("2");
        Operation op1 = new Operation("*", n1, n2);

        Number n3 = new Number("5");

        Operation op2 = new Operation("+", n3, op1);

        Root root = new Root(op2);

        MathThreeProcessor mathThreeProcessor = new MathThreeProcessor();

        assertTrue(21 == mathThreeProcessor.calculate(root));
    }

    @Test
    public void shouldBuildExpressionCorrectly() throws Exception {

        Number n1 = new Number("8");
        Number n2 = new Number("2");
        Operation op1 = new Operation("*", n1, n2);

        Number n3 = new Number("5");

        Operation op2 = new Operation("+", n3, op1);

        Root root = new Root(op2);

        MathThreeProcessor mathThreeProcessor = new MathThreeProcessor();

        assertEquals("(5 + (8 * 2))", mathThreeProcessor.buildExpression(root));
    }
}