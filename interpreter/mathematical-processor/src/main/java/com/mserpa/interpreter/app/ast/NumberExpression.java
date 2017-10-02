package com.mserpa.interpreter.app.ast;

public class NumberExpression extends Expression{

	private Double value;
	
	public NumberExpression(Double value) {
		super();
		this.value = value;
	}

	@Override
	public Double interpret() {		
		return value;
	}

}
