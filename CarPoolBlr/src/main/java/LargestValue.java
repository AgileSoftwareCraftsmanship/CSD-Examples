package main.java;

public class LargestValue {

	public int findMax(int[] arr) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	

}
