package com.hello;

//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
// 示例 1:
//
// 输入: "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//
//
// 示例 2:
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//
//
// 示例 3:
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
//
// Related Topics 哈希表 双指针 字符串 Sliding Window


class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        java.util.List<Character> list = new java.util.ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int length = 0, start;
            char c;
            list.clear();
            start = i;
            c = s.charAt(start);
            while (start < s.length() && !list.contains(c)) {
                length++;
                list.add(c);
                start++;
                if (start < s.length()) {
                    c = s.charAt(start);
                }
            }
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

