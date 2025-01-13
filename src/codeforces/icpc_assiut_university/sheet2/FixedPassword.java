package codeforces.icpc_assiut_university.sheet2;

import java.util.Scanner;

public class FixedPassword
{
	/*
	 * Given multiple lines each line contains a number X which is a password.
	 * Print "Wrong" if the password is incorrect otherwise, print "Correct" and terminate the program.
	 * Note: The "Correct" password is the number 1999.
	 * Input
	 * 	The input contains several passwords.
	 * 	Each line contains a number X (103≤X≤104-1).
	 * Output
	 * 	Print "Wrong" if the password is typed wrong otherwise,
	 * 	print "Correct" if the password is typed correctly
	 * */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int index = 0;
		while (sc.hasNext())
		{
			String password = sc.nextLine();
			if (password.equals("1999"))
			{
				System.out.println("Correct");
				break;
			}
			else
			{
				System.out.println("Wrong");
			}
		}
	}
}
