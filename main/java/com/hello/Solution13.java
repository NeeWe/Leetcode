package com.hello;
/**
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * @author Administrator
 */
public class Solution13 {
    public int romanToInt(String s) {
    	int sum = 0;
    	
    	for(int i = 0;i < s.length();i ++) {
    		switch(s.charAt(i)) {
    			case 'M' : sum += 1000; break;
    			case 'D' : sum += 500; break;
    			case 'C' : sum += 100; break;
    			case 'L' : sum += 50; break;
    			case 'X' : sum += 10; break;
    			case 'V' : sum += 5; break;
    			case 'I' : sum += 1; break;
    			default : break;
    		}
    	}
    	
    	
    	for(int i = 0;i < s.length();i ++) {
    		int j = i;
    		while(s.charAt(i) == 'M' && j >= 1 && s.charAt(j - 1) == 'C') {
    			sum -= 200;
    			j--;
    		}
			while(s.charAt(i) == 'D' && j >= 1 && s.charAt(j - 1) == 'C') {
    			sum -= 200;
    			j--;
    		}
			while(s.charAt(i) == 'L' && j >= 1 && s.charAt(j - 1) == 'X') {
    			sum -= 20;
    			j--;
    		}
			while(s.charAt(i) == 'C' && j >= 1 && s.charAt(j - 1) == 'X') {
    			sum -= 20;
    			j--;
    		}
			while(s.charAt(i) == 'X' && j >= 1 && s.charAt(j - 1) == 'I') {
    			sum -= 2;
    			j--;
    		}
			while(s.charAt(i) == 'V' && j >= 1 && s.charAt(j - 1) == 'I') {
    			sum -= 2;
    			j--;
    		}
    	}
        return sum;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution13().romanToInt("IV"));
	}
}
