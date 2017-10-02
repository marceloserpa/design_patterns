package com.mserpa.interpreter.app.ast;

public abstract class NoTerminalExpression extends Expression{
	
	protected Expression left;
	protected Expression right;
	
	public NoTerminalExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
}
