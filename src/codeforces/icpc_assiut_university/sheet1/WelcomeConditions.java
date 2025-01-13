package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class WelcomeConditions
{
	/*
	 * Given two numbers A and B. Print "Yes" if A is greater than or equal to B. Otherwise print "No".
	 * Input
	 * 	Only one line containing two numbers A and B (0 ≤ A, B ≤ 100).
	 * Output
	 * 	Print "Yes" or "No" according to the statement.
	 * */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		if(a >= b){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
