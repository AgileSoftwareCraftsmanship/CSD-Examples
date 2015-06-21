package main.java;

public class mathHigh {

	public int findLargest(int[] arr) {
		// TODO Auto-generated method stub
		int maxValue=Integer.MIN_VALUE;
		if(arr.length<=0)
			throw new RuntimeException("Empty List");
		for(int index=0; index<=arr.length-1;index++)
		{
			if (maxValue<arr[index])
				maxValue = arr[index];
		}
		
		return maxValue;
	}

}
