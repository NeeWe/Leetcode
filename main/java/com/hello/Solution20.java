package com.hello;
import java.util.Stack;


/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */
/**
 *
 */
class Solution20 {
    public boolean isValid(String s) {
        if("".equals(s)) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i ++) {
            if(!stack.empty() && match(stack.peek() + "" + s.charAt(i))) {
                Character pop = stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.empty();
    }

    private boolean match(String s) {
        if (s.length() != 2) {
            return false;
        }
        String first = s.split("")[0];
        String second = s.split("")[1];
        return first.equals("(") && second.equals(")")
                || first.equals("{") && second.equals("}")
                || first.equals("[") && second.equals("]");
    }


    public static void main(String[] args) {
        System.out.println(new Solution20().isValid("(){}{[]"));
    }
}
// @lc code=end


