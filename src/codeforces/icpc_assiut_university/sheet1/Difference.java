package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class Difference
{
	/*
	* Difference
	* Given four numbers A,B,C and D. Print the result of the following equation :
	* 	X = (A * B) - (C * D).
	* Input:
	* 	Only one line containing 4 separated numbers A,B,C and D
	* Output:
	* 	Print "Difference = " without quotes followed by the equation result.
	 * */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long diff = calcDiff(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("Difference = " + diff);
	}

	public static long calcDiff(long a, long b, long c, long d){
		return (a * b) - (c * d);
	}
}
