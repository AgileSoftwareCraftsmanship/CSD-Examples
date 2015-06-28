package main.java;

public class Square extends Rectangle{
	public void setWidth(int width) {
		this.width = width;
		this.height = width;
		
	}

	public void setHeight(int height) {
		this.height = height;
		this.width = height;
		
	}
	public int area()
	{
		return width*height;
	}

}
