package Arrays;

import java.util.Arrays;

public class RemoveDuplicationFromSortedArray
{
	/*
	 *	Given an integer array nums sorted in non-decreasing order,
	 * 	remove the duplicates in-place such that each unique element appears only once.
	 * 	The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
	 *
	 * */

	public static void main(String[] args)
	{
		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }; // could take input from user
		System.out.println(Arrays.toString(arr));
		int uniqueCount = removeDuplicates(arr);
		System.out.printf("Unique Count = %d%n" , uniqueCount);
		System.out.println(Arrays.toString(arr));
	}

	private static int removeDuplicates(int[] nums)
	{
		int uniqueCount = 0;
		for (int i = 1; i < nums.length; i++)
		{
			int temp = 0;
			if (nums[i] != nums[uniqueCount])
			{
				uniqueCount++;
				temp = nums[uniqueCount];
				nums[uniqueCount] = nums[i];
				nums[i] = temp;
			}
		}
		return uniqueCount + 1;
	}
}
