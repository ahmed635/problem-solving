package ArraysProblems;

import java.util.Arrays;

public class SearchInsertPosition
{
	/*
	 * Given a sorted array of distinct integers and a target value,
	 * return the index if the target is found. If not, return the index where it would be if it were inserted in order.
	 *
	 * You must write an algorithm with O(log n) runtime complexity.
	 * */
	public static void main(String[] args)
	{
		int[] array = { 1, 3, 5, 6 };
		System.out.println(Arrays.toString(array));
		System.out.println("Postion: " + searchInsert(array, 2));
	}

	private static int searchInsert(int[] arr, int target)
	{
		int position = Arrays.binarySearch(arr, target);
		if (position >= 0)
			return position;
		return (position * -1) - 1;
	}
}
