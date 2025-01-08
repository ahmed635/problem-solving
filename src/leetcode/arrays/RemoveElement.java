package leetcode.arrays;

import java.util.Arrays;

public class RemoveElement
{
	/*
	* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
	* The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
	* */

	public static void main(String[] args)
	{
		int[] nums = {3, 2, 2, 3};
		int val = 3;
		System.out.println("nums: " + Arrays.toString(nums));
		int k = removeElement(nums, val);
		System.out.println("k = " + k);
		System.out.println("After Remove " +  val+ " = " + Arrays.toString(nums));
	}

	public static int removeElement(int[] nums, int val){
		int countNotEqualVal = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i] != val){
				int temp = nums[countNotEqualVal];
				nums[countNotEqualVal] = nums[i];
				nums[i] = temp;
				countNotEqualVal++;
			}
		}
		return countNotEqualVal;
	}
}
