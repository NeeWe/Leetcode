package com.hello;

import org.junit.Test;

import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> list = new ArrayList<>(20);
        int[][] table = new int[length][length];
        if(length < 3) {
            return list;
        }

        for(int i = 0; i < length; i ++) {
            for(int j = i + 1; j < length; j ++) {
                table[i][j] = nums[i] + nums[j];
            }
        }

        for(int i = 0; i < length; i ++) {
            int[] num = findNum(table, nums[i]);

            if(num != null) {
                if(i != num[0] && i != num[1]) {
                    ArrayList<Integer> intList = new ArrayList<>();
                    intList.add(nums[i]);
                    intList.add(nums[num[0]]);
                    intList.add(nums[num[1]]);
                    if(!exist(intList, list)) {
                        list.add(intList);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        new Solution15().threeSum(new int[] {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6});
    }

    public int[] findNum(int[][] table, int num) {
        int length = table.length;

        for(int i = 0; i < length; i ++) {
            for(int j = i + 1; j < length; j ++) {
                if(table[i][j] == -num) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public boolean exist(List<Integer> intList, List<List<Integer>> intLists) {
        Set<Integer> set1 = new HashSet<>(intList);
        for(List<Integer> list : intLists) {
            Set<Integer> set2 = new HashSet<>(list);
            if(set1.equals(set2)) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);

        System.out.println(set1.equals(set2));
    }
}
