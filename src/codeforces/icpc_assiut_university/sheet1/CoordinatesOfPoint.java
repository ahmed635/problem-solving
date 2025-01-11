package codeforces.icpc_assiut_university.sheet1;

import java.util.Scanner;

public class CoordinatesOfPoint
{
	/*
	 * Coordinates of a Point
	 * Given two numbers X, Y which donate coordinates of a point in 2D plan. Determine in which quarter does it belong.
	 * Note:
	 * 	Print Q1, Q2, Q3, Q4 according to the quarter in which the point belongs to.
	 * 	Print "Origem" If the point is at the origin.
	 * 	Print "Eixo X" If the point is over X axis.
	 * 	Print "Eixo Y" if the point is over Y axis.
	 * */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		Point p = new Point(x, y);
		System.out.println(p.calcQuarter());
	}
}

class Point
{
	double x;
	double y;

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public String calcQuarter()
	{
		if (x == 0 && y == 0)
		{
			return "Origem";
		}
		else if (x == 0)
		{
			return "Eixo Y";
		}
		else if (y == 0)
		{
			return "Eixo X";
		}
		else if (x > 0 && y > 0)
		{
			return "Q1";
		}
		else if (x > 0 && y < 0)
		{
			return "Q4";
		}
		else if (x < 0 && y > 0)
		{
			return "Q2";
		}
		else
		{
			return "Q3";
		}
	}
}