package StringProblems;

public class LengthOfLastWord
{
	/*
	 * Given a string s consisting of words and spaces,
	 * return the length of the last word in the string.
	 * A word is a maximal substring consisting of non-space characters only.
	 * */

	public static void main(String[] args)
	{
		String s = "luffy is still joyboy";
		int lengthOfLastWord = lengthOfLastWord(s);
		System.out.println("Length of last word is " + lengthOfLastWord);

	}

	public static int lengthOfLastWord(String s)
	{
		String[] s1 = s.split(" ");
		return s1[s1.length - 1].length();
	}
}
