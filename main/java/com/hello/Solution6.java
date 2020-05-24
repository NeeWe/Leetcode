package com.hello;

/**
 * @author Administrator
 */
public class Solution6 {
    public String convert(String s, int numRows) {
    	if(numRows == 0 || numRows == 1 || "".equals(s) || s == null || s.length() < numRows) {
    		return s;
    	}
    	StringBuilder sb = new StringBuilder();
    	int maxSpace = (numRows - 1) * 2, length = s.length(), first, last, current = 0;
    	for(int i = 0; i < numRows; i ++) {
    		current = i;
			sb.append(s.charAt(i));
			first = maxSpace - 2 * i;
    		last = maxSpace - first;
    		while((current = current + first) < length) {
    			if(i != numRows - 1) {
					sb.append(s.charAt(current));
				}
    			if(i == 0) {
					continue;
				}
    			if((current = current + last) < length) {
					sb.append(s.charAt(current));
				}
    		}
    	}
    	return sb.toString();
    }
    
    public static void main(String[] args) {
    	System.out.println(new Solution6().convert("abc", 4));
	}
}
