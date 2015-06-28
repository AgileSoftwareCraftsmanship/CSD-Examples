package test.java;

import main.java.LargestValue;
import junit.framework.TestCase;

public class TestLargestValue extends TestCase{

	public void testMax()
	{
		int [] arr = {3,4,6,8,9,2,1};
		LargestValue obj = new LargestValue();
		assertEquals(9, obj.findMax(arr));
	}
	public void testMaxAgain()
	{
		int [] arr = {3,4,6,8,2,1};
		LargestValue obj = new LargestValue();
		assertEquals(8, obj.findMax(arr));
	}
	
	public void testMaxNull()
	{
		int [] arr = {};
		LargestValue obj = new LargestValue();
		try
		{
		int result = obj.findMax(arr);
		
		fail("arry can't be blank");
		}catch(Exception ex)
		{
			assertTrue(true);
		}
	}
	public void testMaxNegative()
	{
		
		int [] arr = {-3,-4,-6,-8,-9,-2,-1};
		LargestValue obj = new LargestValue();
		assertEquals(-1, obj.findMax(arr));
	}

	
}
