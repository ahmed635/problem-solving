package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class DigitsSummation
{
	/*
	* Digits Summation
	* Given two numbers N and M. Print the summation of their last digits.
	* Input
	* 	Only one line containing two numbers N,M (0≤N,M≤1018).
	* Output
	* 	Print the answer of the problem.
	* */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numberOneLastDigit = findLastDigit(sc.nextLong());
		int numberTwoLastDigit = findLastDigit(sc.nextLong());
		System.out.println(numberOneLastDigit + numberTwoLastDigit);
	}

	public static int findLastDigit(long n){
		return (int) (n % 10);
	}
}
