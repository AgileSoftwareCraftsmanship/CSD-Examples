package test.java;

import main.java.Calculator;
import junit.framework.TestCase;

public class testCalc extends TestCase{
	public void testAddition()
	{
		Calculator calc = new Calculator();
		assertEquals(5, calc.add(2,3));
	}
	public void testAdditionAgain()
	{
		Calculator calc = new Calculator();
		assertEquals(9, calc.add(4,5));
	}

}
