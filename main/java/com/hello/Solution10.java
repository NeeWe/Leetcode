package com.hello;

import java.util.Stack;

/**
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 *
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 *
 * 说明:
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
 *
 * @author Administrator
 */
public class Solution10 {

    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        solution10.isMatch("abcde", ".*");
    }

    /**
     * @param s 字符串
     * @param p 模式
     * @return
     */
    public boolean isMatch(String s, String p) {
        boolean flag = true;

        Stack<Character> seqStack = new Stack<>();
        Stack<Character> ptnStack = new Stack<>();

        addToStack(s, seqStack);
        addToStack(p, ptnStack);

        /*  .  匹配任意单个字符
            *  匹配零个或任意个前面元素
            .* 匹配任意多个任意字符（a-z）
            ** 等同于 *
         */

        while(!seqStack.empty()) {
            Character seqChar = seqStack.pop();
            Character ptnChar = ptnStack.pop();

            if(seqChar != ptnChar) {
                if(ptnChar != '.') {

                }
            }

        }



        return flag;
    }

    public void addToStack(String s, Stack<Character> stack) {
        for(int i = s.length() -1; i >=0; i --) {
            stack.add(s.charAt(i));
        }
    }
}
