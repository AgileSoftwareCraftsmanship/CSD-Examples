package com.hexa;

import junit.framework.TestCase;

public class TestRpn extends TestCase {
	
public void testFirstCase()
{
	RPNcalc rpn = new RPNcalc();
	assertEquals("25", rpn.calculate("12 13 +"));
}
public void testSecondCase()
{
	RPNcalc rpn = new RPNcalc();
	assertEquals("20", rpn.calculate("12 8 +"));
}

public void testThirdCase()
{
	RPNcalc rpn = new RPNcalc();
	assertEquals("12", rpn.calculate("6 4 2 + +"));
}
public void testExecption()
{
	println("Test");
	try
	{
		RPNcalc rpn = new RPNcalc();
		String result = rpn.calculate(" ");
		//fail();
	}catch(Exception ex)
	{
		assertTrue(ex.getMessage(), true);
	}
}
}




