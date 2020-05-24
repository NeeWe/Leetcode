package com.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<String> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;

        for(int i = 0; i < length - 2; i ++) {
            if(nums[i] > 0) {
                break;
            }
            if( nums[i] + nums[length -1 ] + nums[length - 2] < 0) {
                continue;
            }
            for(int j = i + 1; j < length - 1; j ++) {
                int two = nums[i] + nums[j];
                if(two > 0) {
                    break;
                }
                if(two + nums[length - 1] < 0) {
                    continue;
                }
                for(int k = j + 1; k < length; k ++) {
                    if(two + nums[k] > 0) {
                        break;
                    }
                    if(two + nums[k] == 0) {
                        String key = nums[i] + " " + nums[j] + " " + nums[k];
                        boolean added = set.add(key);
                        if(added) {
                            list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        }
                        break;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        List<List<Integer>> threeSum = new Solution15().threeSum(nums);
        System.out.println(threeSum.size());
        System.out.println(System.currentTimeMillis() - currentTimeMillis);
    }
}

