package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class SimpleCalculator
{
	/*
	 * Simple Calculator
	 * Given two numbers X and Y. Print the summation and multiplication and subtraction of these 2 numbers.
	 * Input:
	 * 	Only one line containing two separated numbers X, Y(1<=X,Y<=10^5)
	 * Output:
	 * 	Print 3 lines that contain the following in the same order:
	 * 		- "X + Y = summation result" without quotes.
	 * 		- "X * Y = multiplication result" without quotes.
	 * 		- "X - Y = subtraction result" without quotes.
	 * */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		long y = sc.nextInt();

		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " - " + y + " = " + (x - y));
	}
}
