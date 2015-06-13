package com.integ.test.junit;

import com.integ.main.Largest;

import junit.framework.TestCase;

public class TestLargest extends TestCase {

	public void testLargest()
	{
		Largest large = new Largest();
		int arr[]={4,5,8,2,3};
		assertEquals(8, large.getValue(arr));
	}
}
