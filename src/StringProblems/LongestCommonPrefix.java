package StringProblems;

import java.util.Arrays;

public class LongestCommonPrefix
{

	/*
	 * Write a function to find the longest common prefix string amongst an array of strings.
	 * If there is no common prefix, return an empty string ""
	 *  */

	public static void main(String[] args)
	{
		String[] strs = { "flower", "flower", "flower", "flower" };
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs)
	{
		StringBuilder ans = new StringBuilder();
		Arrays.sort(strs);
		String first = strs[0];
		String last = strs[strs.length - 1];
		for (int i = 0; i < Math.min(first.length(), last.length()); i++)
		{
			if (first.charAt(i) != last.charAt(i))
			{
				return ans.toString();
			}
			ans.append(first.charAt(i));
		}
		return ans.toString();
	}
}
