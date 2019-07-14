package com.hello;
/*
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000
 */
public class Solution5 {
    public String longestPalindrome(String s) {
    	
    	if(s.length() <= 1) {
    		return s;
    	}
    	
    	String longest = "" , tmp = "";
    	int length = s.length(), i, j;
    	for(i = 0; i < length - 1; i ++) {
    		for(j = length; j > i ; j --) {
    			tmp = s.substring(i, j);
    			if((longest.length() > (length - i))||!isPlalindrome(tmp)) {
    			 continue;
    			} else {
    				break;
    			}
    		}
    		if(tmp.length() > longest.length()) {
    			longest = tmp;
    		}
    		if(longest.length() > (length - i)) {
    			return longest;
    		}
    	}
        return longest;
    }
    
    private boolean isPlalindrome(String s) {
    	int length = s.length();
		for(int i = 0; i < length/2; i++) {
			if(!(s.charAt(i) == s.charAt(length-i-1))) {
				return false;
			}
		}
    	return true;
    }
    
    public static void main(String[] args) {
		Solution5 solution = new Solution5();
		System.out.println(solution.longestPalindrome("babadada"));
	}
}
