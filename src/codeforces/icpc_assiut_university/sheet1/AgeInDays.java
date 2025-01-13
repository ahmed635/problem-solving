package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class AgeInDays
{
	/*
	 * Age in Days
	 * Given a Number N corresponding to a person's age (in days). Print his age in years, months and days,
	 * followed by its respective message "years", "months", "days".
	 * Note: consider the whole year has 365 days and 30 days per month.
	 * Input
	 * 	Only one line containing a number N (0≤N≤106).
	 * Output
	 * 	Print the output, like the following examples.
	 * */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Long ageInDays = sc.nextLong();
		Long years = ageInDays / 365;
		Long reminder = ageInDays % 365;
		Long months = reminder / 30;
		reminder = reminder % 30;
		Long days = reminder;
		System.out.printf("%d years%n", years);
		System.out.printf("%d months%n", months);
		System.out.printf("%d days%n", days);
	}
}
