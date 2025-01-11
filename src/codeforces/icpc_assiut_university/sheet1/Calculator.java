package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class Calculator
{
	/*
	 * Calculator
	 * Given a mathematical expression. The expression will be one of the following expressions: A+B, A−B, A∗B and A/B.
	 * Print the result of the mathematical expression.
	 * Input
	 * 	Only one line contains A,S and B (1≤A,B≤104), S is either (+,−,∗,/).
	 * Output
	 * 	Print the result of the mathematical expression.
	 * */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String expression = sc.nextLine();
		String operator = calcOperator(expression);
		String[] elements = expression.split(String.format("\\%s", operator));
		long firstNumber = Long.parseLong(elements[0]);
		long secondNumber = Long.parseLong(elements[1]);
		switch (operator)
		{
			case "+":
				System.out.println(firstNumber + secondNumber);
				break;
			case "-":
				System.out.println(firstNumber - secondNumber);
				break;
			case "*":
				System.out.println(firstNumber * secondNumber);
				break;
			case "/":
				System.out.println(firstNumber / secondNumber);
				break;
			default:
			System.out.println("Invalid operator");
		}
	}

	private static String calcOperator(String expression)
	{
		if (expression.contains("+"))
		{
			return "+";
		}
		else if (expression.contains("-"))
		{
			return "-";
		}
		else if (expression.contains("*"))
		{
			return "*";
		}
		else
		{
			return "/";
		}
	}
}
