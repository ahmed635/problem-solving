package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class MaxAndMin
{
	/*
	 * Given 3 numbers A, B and C, Print the minimum and the maximum numbers.
	 * Input
	 * 	Only one line containing 3 numbers A, B and C (-105≤A,B,C≤105)
	 * Output
	 * Print the minimum number followed by a single space then print the maximum number.
	 * */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] strNumber = line.split(" ");
		int[] numbers = new int[strNumber.length];
		for (int i = 0; i < strNumber.length; i++)
		{
			numbers[i] = Integer.parseInt(strNumber[i]);
		}


		long min = numbers[0];
		long max = numbers[0];
		for (int number : numbers)
		{
			if (number > max)
			{
				max = number;
			}
			else if (number < min)
			{
				min = number;
			}
		}
		System.out.printf("%d %d", min, max);

	}
}
