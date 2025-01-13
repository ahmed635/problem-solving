package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class SummationFromOneToN
{
	/*
	* Summation from 1 to N
	* Given a number N Print the summation of the numbers that is between 1 and N(inclusive).
	* Input
	* 	Only one line containing a number N (1≤N≤109)
	* Output
	* 	Print the summation of the numbers that are between 1 and N (inclusive).
	* */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		long sum = number * (number + 1) / 2;
		System.out.println(sum);
	}
}
