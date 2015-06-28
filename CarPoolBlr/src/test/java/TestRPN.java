package test.java;

import main.java.RPNCalc;
import junit.framework.TestCase;

public class TestRPN extends TestCase{

	public void testAddition2Values()
	{

		RPNCalc calc = new RPNCalc();
		assertEquals(323, calc.calculate("24,299,+"));
	
	}
	public void testAddition3Values()
	{
		RPNCalc calc = new RPNCalc();
		assertEquals(363, calc.calculate("24,299,+,40,+"));
	
	}
	
	
	
}
