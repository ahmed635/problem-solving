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
		long sum = 0;
		for(int i=1; i<=number; i++){
			sum += i;
		}
		System.out.println(sum);
	}
}
