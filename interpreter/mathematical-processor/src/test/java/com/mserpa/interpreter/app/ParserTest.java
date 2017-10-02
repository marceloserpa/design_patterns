package com.mserpa.interpreter.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParserTest {

	private Parser parser;
	
	@Before
	public void setup() {
		this.parser = new Parser();
	}
	
	@Test
	public void testSum() {
		//Given
		String expression = "5 + 4";
		
		// When
		Double actual = parser.compile(expression);
		
		//Then
		Double expected = 9D;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSumWithMinus() {
		//Given
		String expression = "5 + 4 - 2";
		
		// When
		Double actual = parser.compile(expression);
		
		//Then
		Double expected = 7D;
		assertEquals(expected, actual);
	}
	
}
