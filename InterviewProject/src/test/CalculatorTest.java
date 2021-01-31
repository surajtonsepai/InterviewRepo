package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {

	@Test
	public void addTest() {

		Calculator calculator = new Calculator();

		assertEquals(4, calculator.add(2, 2));

	}

}
