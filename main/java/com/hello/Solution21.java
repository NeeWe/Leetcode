package com.hello;

/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        } else if(l2 == null) {
            return l1;
        }

        ListNode listNode = null;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                listNode = appendNode(listNode, l1);
                l1 = l1.next;
            } else {
                listNode = appendNode(listNode, l2);
                l2 = l2.next;
            }
        }

        while(l1 != null) {
            listNode = appendNode(listNode, l1);
            l1 = l1.next;
        }

        while(l2 != null) {
            listNode = appendNode(listNode, l2);
            l2 = l2.next;
        }
        return listNode;
    }

    private ListNode appendNode(ListNode link, ListNode node) {
        ListNode tmpNode = new ListNode(node.val);
        if(link == null) {
            tmpNode.next = null;
            return tmpNode;
        }

        tmpNode.next = null;
        ListNode listNode = link;

        while(link.next != null) {
            link = link.next;
        }

        link.next = tmpNode;

        return listNode;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        l4.next = l5;
        l5.next = l6;

        ListNode listNode = new Solution21().mergeTwoLists(null, null);
        System.out.println(listNode);
    }
}
// @lc code=end


