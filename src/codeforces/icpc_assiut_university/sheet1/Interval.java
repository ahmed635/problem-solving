package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class Interval
{
	/*
	 * Given a number X. Determine in which of the following intervals the number X belongs to:
	 * [0,25], (25,50], (50,75], (75,100]
	 * Note:
	 * 	if X belongs to any of the above intervals print "Interval " followed by the interval.
	 *	if X does not belong to any of the above intervals print "Out of Intervals".
	 * 	The symbol '(' represents greater than.
	 * 	The symbol ')' represents smaller than.
	 * 	The symbol '[' represents greater than or equal.
	 * 	The symbol ']' represents smaller than or equal.
	 **/
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double interval = sc.nextDouble();
		if (interval > 0 && interval <= 25.0)
		{
			System.out.println("Interval [0,25]");
		}
		else if (interval > 25.0 && interval <= 50.0)
		{
			System.out.println("Interval (25,50]");
		}
		else if (interval > 50.0 && interval <= 75.0)
		{
			System.out.println("Interval (50,75]");
		}
		else if (interval > 75.0 && interval <= 100.0)
		{
			System.out.println("Interval (75,100]");
		}
		else
		{
			System.out.println("Out of Intervals");
		}
	}

}
