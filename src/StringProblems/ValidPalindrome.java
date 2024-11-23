package StringProblems;

public class ValidPalindrome
{
	/*
	 * A phrase is a palindrome if,
	 * after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
	 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.Given a string s,
	 * return true if it is a palindrome, or false otherwise.*/

	public static void main(String[] args)
	{
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s)
	{
		StringBuilder alphaChars = new StringBuilder();
		s = s.toLowerCase();
		if(s.isEmpty()) return true;
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isLetterOrDigit(s.charAt(i)))
				alphaChars.append(s.charAt(i));
		}
		return alphaChars.toString().equals(alphaChars.reverse().toString());
	}
}
