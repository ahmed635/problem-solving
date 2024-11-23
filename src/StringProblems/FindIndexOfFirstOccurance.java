package StringProblems;

public class FindIndexOfFirstOccurance
{
	/*
	 * Given two strings needle and haystack,
	 * return the index of the first occurrence of needle in haystack,
	 * or -1 if needle is not part of haystack.
	 * */

	public static void main(String[] args)
	{
		String haystack = "leetcode";
		String needle = "leeto";
		int index = strStr(haystack, needle);
		System.out.println(index);
	}

	public static int strStr(String haystack, String needle)
	{
		if (haystack.isEmpty() || needle.isEmpty())
			return -1;
		return haystack.indexOf(needle);
	}
}
