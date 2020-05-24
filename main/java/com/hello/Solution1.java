package com.hello;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        if(nums.length < 2) {
            return new int[]{};
        }

        Map<Integer, Integer> map = new HashMap<>(64);

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 7, 11, 15};
        int[] ints = new Solution1().twoSum(nums, 4);
        System.out.println(Arrays.toString(ints));
    }
}
//leetcode submit region end(Prohibit modification and deletion)