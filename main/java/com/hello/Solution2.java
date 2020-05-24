package com.hello;

import java.util.LinkedList;
import java.util.Stack;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        Stack<Integer> s11 = new Stack<>();
        Stack<Integer> s22 = new Stack<>();


        int jw = 0;
        while(l1.next != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        s1.push(l1.val);

        while(l2.next != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        s2.push(l2.val);

        while(!s1.isEmpty()) {
            s11.push(s1.pop());
        }
        while(!s2.isEmpty()) {
            s22.push(s2.pop());
        }
        while(!s11.isEmpty() && !s22.isEmpty()) {

            if(s11.peek() + s22.peek() + jw >=10) {
                s3.push(s11.pop() + s22.pop() + jw - 10);
                jw = 1;
            }
            else {
                s3.push(s11.pop() + s22.pop() + jw);
                jw = 0;
            }

        }

        if(!s11.isEmpty()) {
            while(!s11.isEmpty()) {
                if(s11.peek() + jw >= 10) {
                    s3.push(s11.pop() + jw - 10);
                    jw = 1;
                }
                else {
                    s3.push(s11.pop() + jw);
                    jw = 0;
                }
            }
        }

        else if(!s22.isEmpty()) {
            while(!s22.isEmpty()) {
                if(s22.peek() + jw >= 10) {
                    s3.push(s22.pop() + jw - 10);
                    jw = 1;
                }
                else {
                    s3.push(s22.pop() + jw);
                    jw = 0;
                }
            }
        }

        if(jw == 1) {
            s3.push(jw);
        }

        LinkedList<ListNode> tmp = new LinkedList<ListNode>();
        while(!s3.isEmpty()) {
            tmp.add(new ListNode(s3.pop()));
        }

        int i;
        for(i = tmp.size()-1;i > 0;i--) {
            tmp.get(i).next = tmp.get(i-1);
        }
        tmp.get(i).next = null;
        return tmp.get(tmp.size()-1);
    }
}
