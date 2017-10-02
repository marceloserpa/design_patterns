package com.mserpa.interpreter.app;

import java.util.function.BiFunction;

import org.junit.Test;

import static org.junit.Assert.*;

import com.mserpa.interpreter.app.ast.Expression;
import com.mserpa.interpreter.app.ast.MinusExpression;
import com.mserpa.interpreter.app.ast.NumberExpression;
import com.mserpa.interpreter.app.ast.PlusExpression;

public class OperationFactoryTest {

	@Test
	public void testPlusOperation() {
		// Given
		String operation = "+";
		Expression a = new NumberExpression(2D);
		Expression b = new NumberExpression(3D);
		
		// When
		BiFunction<Expression, Expression, Expression> plusOperation = OperationFactory.create(operation);
		Expression plusExpression = plusOperation.apply(a, b);
		
		// Then
		assertTrue(plusExpression instanceof PlusExpression);
	}
	
	@Test
	public void testMinusOperation() {
		// Given
		String operation = "-";
		Expression a = new NumberExpression(2D);
		Expression b = new NumberExpression(3D);
		
		// When
		BiFunction<Expression, Expression, Expression> minusOperation = OperationFactory.create(operation);
		Expression minusExpression = minusOperation.apply(a, b);
		
		// Then
		assertTrue(minusExpression instanceof MinusExpression);
	}
	
}
