package com.hello;
/*盛水最多的容器*/
public class Solution11 {
    public int maxArea(int[] height) {
    	int length = height.length, max = 0, tmp = 0;
    	
    	for(int i = 0;i < length; i ++) {
    		tmp = 0;
			if(height[i] < height[length-1]) {
				tmp = height[i] * (length - i - 1);
			} else {
				int tmp2 = 0;
				for(int j = length - 1; j >= 0; j --) {
					tmp2 = (j - i) * Integer.min(height[i], height[j]);
					if(tmp < tmp2) {
						tmp = tmp2;
					}
				}
				
			}
			
			if(max < tmp) {
				max = tmp;
			}
			
    	}
    	return max;
    }
    
    public static void main(String[] args) {
    	System.out.println(new Solution11().maxArea(new int[] {1,3}));
	}
}
