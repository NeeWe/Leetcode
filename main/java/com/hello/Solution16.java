package com.hello;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        Arrays.sort(nums);
        int minSum = Integer.MAX_VALUE;
        int minThree = Integer.MAX_VALUE;
        int length = nums.length;
        for(int i = 0; i < length - 2; i ++) {
            // if(Math.abs(nums[i] - target) > minSum && nums[i] >=0) break;
            for(int j = i + 1; j < length -1; j ++) {
                // if(Math.abs(nums[i] + nums[j] -target) > minSum) break;
                for(int k = j + 1; k < length; k ++) {
                    int tmp = Math.abs(nums[i] + nums[j] + nums[k] - target);
                    // if(tmp > minSum) break;
                    if(tmp < minSum) {
                        minSum = tmp;
                        minThree = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }
        return minThree;
    }

    public static void main(String[] args) {
        int threeSumClosest = new Solution16().threeSumClosest(new int[] {1, 2, 5, 10, 11}, 12);
        System.out.println(threeSumClosest);
    }
}
// @lc code=end


