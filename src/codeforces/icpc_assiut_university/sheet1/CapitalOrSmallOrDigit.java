package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class CapitalOrSmallOrDigit
{
	/*
	 * Capital or Small or Digit
	 * Given a letter X. Determine whether X is Digit or Alphabet and if it is Alphabet determine if it is Capital Case or Small Case.
	 * Note:
	 * 	Digits in ASCII '0' = 48,'1' = 49 ....etc
	 * 	Capital letters in ASCII 'A' = 65, 'B' = 66 ....etc
	 * 	Small letters in ASCII 'a' = 97,'b' = 98 ....etc
	 * Input
	 * 	Only one line containing a character X which will be a capital or small letter or digit.
	 * Output
	 * 	Print a single line contains "IS DIGIT" if X is digit otherwise,
	 * 	print "ALPHA" in the first line followed by a new line that contains "IS CAPITAL"
	 * 	if X is a capital letter and "IS SMALL" if X is a small letter.
	 * */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String letter = sc.nextLine();
		if (letter.matches("[A-Z]"))
		{
			System.out.println("ALPHA");
			System.out.println("IS CAPITAL");
		}
		else if (letter.matches("[a-z]"))
		{
			System.out.println("ALPHA");
			System.out.println("IS SMALL");
		}
		else if (letter.matches("[0-9]"))
		{
			System.out.println("IS DIGIT");
		}
		else
		{
			System.out.println("Not Valid");
		}
	}
}
