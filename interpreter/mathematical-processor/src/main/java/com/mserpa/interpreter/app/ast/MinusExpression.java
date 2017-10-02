package com.mserpa.interpreter.app.ast;

public class MinusExpression extends NoTerminalExpression{

	public MinusExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public Double interpret() {
		return left.interpret() - right.interpret();
	}

}
