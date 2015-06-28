package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.Rectangle;
import main.java.Square;

public class TestArea {

	@Test
	public void testSquareArea()
	{
		Rectangle rect = new Square();
		rect.setHeight(50);
		rect.setWidth(40);
		Assert.assertEquals(1600, rect.area());
	}
	@Test
	public void testRectangleArea()
	{
		Rectangle rect = new Rectangle();
		rect.setHeight(50);
		rect.setWidth(40);
		Assert.assertEquals(2000, rect.area());
	}
}
