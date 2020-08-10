package com.hello;
/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 */
public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        return null;
    }

    private ListNode mergeTwo(ListNode one, ListNode two) {
        if(one == null) {
            return two;
        }
        if (two == null) {
            return one;
        }
        return null;
    }
}
