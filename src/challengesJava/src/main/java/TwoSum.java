/*
* Given an array of integers nums and an integer target, return indices of the
* two numbers such that they add up to target.
* You may assume that each input would have exactly one solution,
* and you may not use the same element twice.
* You can return the answer in any order.
*
* Example 1:
*
* Input: nums = [2,7,11,15], target = 9
* Output: [0,1]
* Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*
* Example 2:
* Input: nums = [3,2,4], target = 6
* Output: [1,2]
* Example 3:
*
* Input: nums = [3,3], target = 6
* Output: [0,1]
* */

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] finalArray = new int[2];
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = nums[i], b = nums[j];
                if (a + b == target) {
                    finalArray[0] = i;
                    finalArray[1] = j;
                    break;
                }
            }
        }

        return finalArray;

    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        //int[] nums = {5, 7, 9, 3, 6};
        int[] nums = {0,4,3,0};
        System.out.println(Arrays.toString(ts.twoSum(nums, 10)));
    }
}
