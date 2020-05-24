package com.hello;

/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
 */

// @lc code=start

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }
        Queue<ListNode> queue = new LinkedBlockingQueue<>();
        int listSize = getListSize(head);
        int order = listSize - n;
        for(int i = 0; i < listSize; i ++) {
            if(order != i) {
                queue.add(head);
            }
            head = head.next;
        }

        ListNode listNode = queue.peek();
        while(!queue.isEmpty()) {
            queue.poll().next = queue.peek();
        }

        return listNode;
    }

    private int getListSize(ListNode list) {
        int size = 0;
        if(list.next == null) {
            return size;
        } else {
            while(list.next != null) {
                list = list.next;
                size ++;
            }
        }

        return size + 1;
    }

    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;

        ListNode listNode = solution19.removeNthFromEnd(listNode1, 1);
        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

// @lc code=end
