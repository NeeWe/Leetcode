package com.hello;

/**
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/divide-two-integers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author Administrator
 */
public class Solution29 {
    public static int divide(int dividend, int divisor) {
        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);

        String binAbsDividend = Integer.toBinaryString(absDividend);
        System.out.println(binAbsDividend);
        String binAbsDivisor = Integer.toBinaryString(absDivisor);
        System.out.println(binAbsDivisor);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648 ,-1));
    }
}
