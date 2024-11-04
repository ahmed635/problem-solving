package ArraysProblems;
import java.util.Arrays;

public class MedianOfTwoSortedArrays
{
	/*
	 * Given two sorted arrays num1 and num2 of size m and n respectively
	 * Return the median of the two sorted arrays
	 * Time complexity should be O(log(m+n))
	 * */

	public static void main(String[] args)
	{
		int[] nums1 = new int[] {1, 3};
		int[] nums2 = new int[] {2};
		double median;
		median = findMedianSortedArrays(nums1, nums2);
		System.out.println("Median: " + median);
	}

	private static double findMedianSortedArrays(int[] nums1, int[] nums2){
		int[] mergedArray = mergeTwoArrays(nums1, nums2);
		Arrays.parallelSort(mergedArray);
		return getMedian(mergedArray);
	}

	private static double getMedian(int[] mergedArray)
	{
		if(mergedArray.length % 2 == 0)
			return getMedianIfSizeEven(mergedArray);
		else
			return getMedianIfSizeOdd(mergedArray);
	}

	private static double getMedianIfSizeOdd(int[] mergedArray)
	{
		int index = mergedArray.length / 2;
		return mergedArray[index];
	}

	private static double getMedianIfSizeEven(int[] mergedArray)
	{
		int size = mergedArray.length;
		return (double) (mergedArray[(size - 1) / 2] + mergedArray[size / 2]) / 2;
	}

	private static int[] mergeTwoArrays(int[] arr1, int[] arr2){
		int mergedArraySize = arr1.length + arr2.length;
		int[] mergedArray = new int[mergedArraySize];
		System.arraycopy(arr1,0 , mergedArray, 0, arr1.length);
		System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
		return mergedArray;
	}

	/*
	 * this is optimized solution to approve time complexity: O(m+n)
	 * */
	private static double optimizedSolution(int[] nums1, int[] nums2)
	{
		int m = nums1.length;
		int n = nums2.length;

		if ((m + n) % 2 == 0)
		{
			for (int i = 0; i < (m + n); i++)
			{
				int temp = getMin(nums1, nums2);
			}
			return (double) (getMin(nums1, nums2) + getMin(nums1, nums2));
		}
		else
		{
			for (int i = 0; i < (m + n); i++)
			{
				int temp = getMin(nums1, nums2);
			}
			return getMin(nums1, nums2);
		}
	}

	private static int getMin(int[] nums1, int[] nums2)
	{
		int p1 = 0;
		int p2 = 0;
		if (p1 < nums1.length && p2 < nums2.length)
			return Math.min(nums1[p1], nums2[p2]);
		else if (p2 < nums2.length)
			return nums2[p2++];
		else if (p1 < nums1.length)
			return nums1[p1++];
		return -1;
	}
}
