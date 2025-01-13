package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class TwoNumbers
{
	/* Two Numbers
	 *  Given 2 numbers A and B. Print floor, ceil and round of A/B
	 *  Note:
	 * 	Floor: Is a mathematical function that takes a real number X and its output is the greatest integer less than or equal to X.
	 * 	Ceil: Is a mathematical function that takes a real number X and its output is the smallest integer larger than or equal to X.
	 * 	Round: Is a mathematical function that takes a real number X and its output is the closest integer to that number X.
	 * For more clarification visit the links in the notes below.
	 * Input
	 * 	Only one line containing two numbers A and B (1≤A,B≤103)
	 * Output
	 * 	Print 3 lines that contain the following in the same order:
	 * 		"floor A / B = Floor result" without quotes.
	 * 		"ceil A / B = Ceil result" without quotes.
	 * 		"round A / B = Round result" without quotes.
	 * */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String strNumbers = sc.nextLine();
		String[] s = strNumbers.split(" ");
		long a = Long.parseLong(s[0]);
		long b = Long.parseLong(s[1]);

		double divide = (double) a / b;
		System.out.printf("floor %d / %d = %d%n", a, b, (long) Math.floor(divide));
		System.out.printf("ceil %d / %d = %d%n", a, b, (long) Math.ceil(divide));
		System.out.printf("round %d / %d = %d%n", a, b, Math.round(divide));

	}
}
