package eraa_soft.oop.question_3;

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Numbers numbers = new Numbers();
		System.out.println("Enter first Even number: ");
		numbers.setNumber1(sc.nextInt());
		System.out.println("Enter second Even number: ");
		numbers.setNumber2(sc.nextInt());
		System.out.println("Enter third Even number: ");
		numbers.setNumber3(sc.nextInt());

		int sum = numbers.calcSumIfAllNumberAreEven();
		if (sum > 0)
		{
			System.out.println("Sum: " + sum);
		}
		else
		{
			System.out.println("Invalid numbers");
		}

	}
}
