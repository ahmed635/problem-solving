 package codeforces.icpc_assiut_university.sheet2;

import java.util.Scanner;

public class Statistics
{
	/*
	 * Given N numbers. Count how many of these values are even, odd, positive and negative.
	 * Input
	 * 	First line contains one number N (1≤N≤103) number of values.
	 * 	Second line contains N numbers (-105≤Xi≤105).
	 * Output
	 * 	Print four lines with the following format:
	 * 	First Line: "Even: X", where X is the number of even numbers in the given input.
	 * 	Second Line: "Odd: X", where X is the number of odd numbers in the given input.
	 * 	Third Line: "Positive: X", where X is the number of positive numbers in the given input.
	 * 	Fourth Line: "Negative: X", where X is the number of negative numbers in the given input.
	 * */

	public static void main(String[] args)
	{
		int countOdd = 0;
		int countEven = 0;
		int countNegative = 0;
		int countPositive = 0;
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		for (int i = 0; i < size; i++)
		{
			int number = sc.nextInt();
			if (isEven(number))
			{
				countEven++;
			}
			else
			{
				countOdd++;
			}

			if (isPositive(number))
			{
				countPositive++;
			} else if(number == 0){

			}
			else
			{
				countNegative++;
			}
		}

		System.out.println("Even: "+ countEven);
		System.out.println("Odd: "+ countOdd);
		System.out.println("Positive: "+ countPositive);
		System.out.println("Negative: "+ countNegative);

	}

	public static boolean isEven(int number)
	{
		return number % 2 == 0;
	}

	public static boolean isPositive(int number)
	{
		return number > 0;
	}
}
