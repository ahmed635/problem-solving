package leetcode.StringProblems;

import java.util.*;

public class FizzBuzz
{
	/*
	 * Given an integer, return an array of string where:
	 * arr[i] == "FizzBuzz" if i is divisible by 3 and 5.
	 * arr[i] == "Fizz" if i is divisible by 3.
	 * arr[i] == "Buzz" if i is divisible by 5.
	 * arr[i] == i (as a string) if none of the above conditions are true.*/

	public static void main(String[] args)
	{
		int n = 15;
		List<String> strings = fizzBuzz(n);
		System.out.println(strings);
	}

	public static List<String> fizzBuzz(int n)
	{
		List<String> answers = new ArrayList<>();
		for (int i = 1; i <= n; i++)
		{

			if (isDivisibleBy3(i) && isDivisibleBy5(i))
			{
				answers.add("FizzBuzz");
			}
			else if (isDivisibleBy3(i))
			{
				answers.add("Fizz");
			}
			else if (isDivisibleBy5(i))
			{
				answers.add("Buzz");
			}
			else
			{
				answers.add(i + "");
			}
		}
		return answers;
	}

	private static boolean isDivisibleBy5(int i)
	{
		return i % 5 == 0;
	}

	private static boolean isDivisibleBy3(int i)
	{
		return i % 3 == 0;
	}
}
