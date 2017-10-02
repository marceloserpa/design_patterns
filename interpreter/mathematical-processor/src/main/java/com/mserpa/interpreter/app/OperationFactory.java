package com.mserpa.interpreter.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import com.mserpa.interpreter.app.ast.Expression;
import com.mserpa.interpreter.app.ast.MinusExpression;
import com.mserpa.interpreter.app.ast.PlusExpression;

public class OperationFactory {	
	
	private final static Map<String, BiFunction<Expression,Expression, Expression>> operations;
	
	static {
		operations = new HashMap<String, BiFunction<Expression,Expression, Expression>>() {{
			put("+", (a, b) -> new PlusExpression(a, b));
			put("-", (a, b) -> new MinusExpression(a, b));
		}};
	}
	

	public static BiFunction<Expression,Expression, Expression> create(String operation){
		return operations.get(operation);
	}
	
}
