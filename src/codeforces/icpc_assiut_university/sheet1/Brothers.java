package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class Brothers
{
	/*
	 * The Brothers
	 * Given two person names.
	 * Each person has {"the first name" + "the second name"}
	 * Determine whether they are brothers or not.
	 * Note: The two persons are brothers if they share the same second name.
	 * Input
	 * 	First line will contain two Strings F1, S1 which donates the first and second name of the 1st person.
	 * 	Second line will contain two Strings F2, S2 which donates the first and second name of the 2nd person.
	 * Output
	 * 	Print "ARE Brothers" if they are brothers otherwise print "NOT".
	 * */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String personOne = sc.nextLine();
		String personTwo = sc.nextLine();

		if (personOne.split(" ")[1].equals(personTwo.split(" ")[1]))
		{
			System.out.println("ARE Brothers");
		}
		else
		{
			System.out.println("NOT");
		}
	}
}
