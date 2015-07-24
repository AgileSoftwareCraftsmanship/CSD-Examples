package com.hexa;

import java.util.Stack;

public class RPNcalc {
	public String calculate(String expr)
	{
		String exprArr [] = expr.split(" ");
		
		int result=0; 
		Stack<String> stack = new Stack<String>();
		for(int i =0; i<exprArr.length; i++)
		{
			if(exprArr[i].equalsIgnoreCase("+"))
			{
				String secondValue = stack.pop();
				String firstValue = stack.pop();
				result= Integer.valueOf(secondValue)+ Integer.valueOf(firstValue);
				stack.push(String.valueOf(result));
			}
			else
			{
				stack.push(exprArr[i]);
			}
					
		}
		return stack.pop();
		
		//return "25";
	}

}
