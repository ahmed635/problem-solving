package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class Char
{
	/*
	* Char
	* Given a letter X. If the letter is lowercase print the letter after converting it from lowercase letter to uppercase letter.
	* Otherwise, print the letter after converting it from uppercase letter to lowercase letter
	* Note : difference between 'a' and 'A' in ASCII is 32 .
	* Input
	* 	Only one line containing a character X which will be a capital or small letter.
	* Output
	* 	Print the answer to this problem.
	* */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String letter = sc.nextLine();
		if(letter.matches("[a-z]")){
			System.out.println(letter.toUpperCase());
		} else {
			System.out.println(letter.toLowerCase());
		}
	}
}
