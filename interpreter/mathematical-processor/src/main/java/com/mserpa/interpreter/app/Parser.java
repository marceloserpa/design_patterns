package com.mserpa.interpreter.app;

import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.StringTokenizer;

import com.google.common.collect.Lists;
import com.mserpa.interpreter.app.ast.Expression;
import com.mserpa.interpreter.app.ast.NumberExpression;

public class Parser {

	public Double compile(String expression) {
		List<String> tokens = Lists.newArrayList();
		StringTokenizer token = new StringTokenizer(expression);
		while(token.hasMoreTokens()) {
			tokens.add(token.nextToken());
		}		
		// build stack of tokens
		Stack<String> stack = new Stack<>();
		List<String> reversedLists = Lists.reverse(tokens);
		reversedLists.stream().forEach(item -> stack.push(item));
		
		Expression tree = parseTree(stack);
		
		return tree.interpret();
	}

	private Expression parseTree(Stack<String> stack) {
		return parse(stack, null);
	}
	
	private Expression parse(Stack<String> stack, Expression root) {		
		Expression firstExpression = null;
		Expression secondExpression = null;
		
		if(Objects.nonNull(root)) firstExpression = root;
				
		while(!stack.isEmpty()) {
			if(Objects.nonNull(secondExpression)) return parse(stack, secondExpression);
			String element = stack.pop();			
			if(isNumber(element)) {				
				firstExpression = new NumberExpression(Double.valueOf(element));				
			} else {
				if(isSupportedOperation(element)) {
					String next = stack.pop();
					Expression second = new NumberExpression(Double.valueOf(next));				
					secondExpression = OperationFactory.create(element).apply(firstExpression, second);
				}
			}			
		}
		return secondExpression;
	}
	
	private Boolean isSupportedOperation(String operation) {
		return "+".equals(operation) || "-".equals(operation);
	}
	
	private Boolean isNumber(String token) {
		try {
			Double.valueOf(token);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
}
