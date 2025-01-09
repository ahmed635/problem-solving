package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class AreaOfCircle
{
	/*
	* Area of a Circle
	* Given a number R calculate the area of a circle using the following formula:
	* 	Area = π*R2.
	* 	Note: consider π = 3.141592653.
	* Input
	* 	Only one line containing the number R (1 ≤ R ≤ 100).
	* Output
	* 	Print the calculated area, with 9 digits after the decimal point.
	* */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double area = calcAreaOfCircle(sc.nextDouble());
		System.out.printf("%.9f", area);
	}

	public static double calcAreaOfCircle(double radius){
		return Math.PI * radius * radius;
	}
}
