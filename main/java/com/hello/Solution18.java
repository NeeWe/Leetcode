package com.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length < 4) {
            return new ArrayList<>();
        } else if(nums.length == 4 && nums[0] + nums[1] + nums[2] + nums[3] == target) {
            List<List<Integer>> l = new ArrayList<>();
            l.add(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));
            return l;
        }

        Set<String> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;

        for(int i = 0; i < length - 3; i ++) {
            // if(nums[i] > target) break;
            // if( nums[i] + nums[length -1 ] + nums[length - 2] + nums[length - 3] < target) continue;
            for(int j = i + 1; j < length - 2; j ++) {
                int two = nums[i] + nums[j];
                // if(two > target) break;
                // if(two + nums[length - 1] + nums[length - 2] < target) continue;
                for(int k = j + 1; k < length - 1; k ++) {
                    int three = two + nums[k];
                    // if(three > target) break;
                    // if(three + nums[length - 1] < target) continue;
                    for(int l = k + 1; l < length; l ++) {
                        int four = three + nums[l];
                        if(four == target) {
                            String key = nums[i] + "" + nums[j] + "" + nums[k] + "" + nums[l];
                            if(set.add(key)) {
                                list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                            }
                            break;
                        }

                    }
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {1,-2,-5,-4,-3,3,3,5};
        int target = -11;
        List<List<Integer>> fourSum = new Solution18().fourSum(nums, target);
        fourSum.forEach(list -> {
            list.forEach(i -> {
                System.out.print(i + " ");
            });
            System.out.println();
        });
    }
}
// @lc code=end


