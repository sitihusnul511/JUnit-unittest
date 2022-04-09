package com.juaracoding.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.juaracoding.junit.calculator.Calculator;

public class TestCalculator {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		
		int a = 10, b =20;
		
		int actual = calculator.add(a, b);
		
//		int expect = 30;
		assertEquals(30, actual);
		
	}
	
	@Test
	public void testSubstract() {
		Calculator calculator = new Calculator();
		
		double a = 10, b =20;
		
		double actual = calculator.substract(a, b);
		
		double expect = 10;
		assertEquals(expect, actual, 0.0);
		
	}

}
