package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class Multiples
{
	/*
	 * Given two numbers A and B. Print "Multiples" if A is multiple of B or vice versa. Otherwise print "No Multiples".
	 * Input
	 * 	Only one line containing two numbers A,B (1 ≤ A,B ≤ 106)
	 * Output
	 * 	Print the "Multiples" or "No Multiples" corresponding to the read numbers.
	 * */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		if (a % b == 0)
		{
			System.out.println("Multiples");
		}
		else if (b % a == 0)
		{
			System.out.println("Multiples");
		}
		else
		{
			System.out.println("No Multiples");
		}
	}
}
