package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class FirstDigit
{
	/*
	 * First digit
	 * Given a number X. Print "EVEN" if the first digit of X is even number. Otherwise, print "ODD".
	 * For example: In 4569 the first digit is 4, the second digit is 5, the third digit is 6 and the fourth digit is 9.
	 * Input
	 * 	Only one line containing a number X (999 < X ≤ 9999)
	 * Output
	 * 	If the first digit is even print "EVEN" otherwise print "ODD".
	 * */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String strNumber = sc.nextLine();
		String[] digits = strNumber.split("");
		if (Long.parseLong(digits[0]) % 2 == 0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
	}
}
