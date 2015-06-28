package main.java;

import java.util.Stack;

public class RPNCalc {
	
	public int calculate(String expression)
	{
		String rpnArray[]= expression.split(",");
		Stack<String> stack = new Stack<String>();
		Calculator calc = new Calculator();
		for(int i=0; i<rpnArray.length;i++)
		{
			System.out.println(rpnArray[i]);
			if(isOperator(rpnArray[i]))
			{
				String secondValue = stack.pop();
				String firstValue= stack.pop();
				int result = calc.add(Integer.parseInt(firstValue),Integer.parseInt(secondValue));
				stack.push(String.valueOf(result));
			}
			else if(rpnArray[i].equals("-"))
			{
				String secondValue = stack.pop();
				String firstValue= stack.pop();
				int result = Integer.parseInt(firstValue)-Integer.parseInt(secondValue);
				stack.push(String.valueOf(result));
			}
			else
			{
				stack.push(rpnArray[i]);
				
			}
				
		}
		return Integer.parseInt(stack.pop());
	}
	public boolean isOperator(String arg1)
	{
		if (arg1.equals("+"))
		return true;
		else
			return false;
	}

}
