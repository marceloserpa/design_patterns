package com.mserpa.interpreter.app.ast;

public class PlusExpression extends NoTerminalExpression {
	
	public PlusExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public Double interpret() {		
		return left.interpret() + right.interpret() ;
	}
	
}
