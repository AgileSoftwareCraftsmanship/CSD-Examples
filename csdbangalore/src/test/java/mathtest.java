package test.java;

import org.junit.Test;

import main.java.mathHigh;
import junit.framework.TestCase;

public class mathtest extends TestCase{
	 
	public void testFindLargest()
	{
		int arr[]= {8,7,8,5,9,6};
		mathHigh mathhigh = new mathHigh();
		assertEquals(9, mathhigh.findLargest(arr));
	}

	public void testFindLargestNew()
	{
		int arr[]= {8,7,8,5,11,6};
		mathHigh mathhigh = new mathHigh();
		assertEquals(11, mathhigh.findLargest(arr));
	}
	public void testFindLargestLast()
	{
		int arr[]= {8,7,8,5,6,11};
		mathHigh mathhigh = new mathHigh();
		assertEquals(11, mathhigh.findLargest(arr));
	}
	public void testFindLargestNegative()
	{
		int arr[]= {-8,-7,-8,-5,-6,-11};
		mathHigh mathhigh = new mathHigh();
		assertEquals(-5, mathhigh.findLargest(arr));
	}
	public void testFindLargestSingle()
	{
		int arr[]= {-5};
		mathHigh mathhigh = new mathHigh();
		assertEquals(-5, mathhigh.findLargest(arr));
	}
	@Test(expected= RuntimeException.class)
	public void testFindLargestEmpty()
	{
		//try{
			int arr[]= {};
			mathHigh mathhigh = new mathHigh();
			fail();
			int value = mathhigh.findLargest(arr);
			//fail("Should throw execption");
		//}catch(RuntimeException ex)
		//{
			//assertTrue(true);
		//}
		
	}
	public void testFindLargestDecimal()
	{
		int arr[]= {8,7,8,5,6,11,11};
		mathHigh mathhigh = new mathHigh();
		assertEquals(11, mathhigh.findLargest(arr));
	}
}
