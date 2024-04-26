package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 3};
        int target = 6;
        int[] result = new int[2];

        System.out.println(Arrays.toString(nums));
        result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }

    /*
    * Time: O(n^2)
    * Space: O(1)
    * */
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    /*
    * Time: O(n)
    * Space: O(n)
    * */
    public static int[] optimzeTimeAndSpace(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            int x = target - current;
            if(map.containsKey(x))
                return new int[]{i, map.get(x)};
            map.put(current, i);
        }
        return nums;
    }
}
