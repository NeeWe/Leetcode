package com.hello;

/**
 * 按序打印
 * @author Administrator
 */
public class Solution1114 {

    int i = 0, j = 0;

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        i++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (i != 1) {
            Thread.sleep(1);
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        j ++;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (j != 1) {
            Thread.sleep(1);
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public static void main(String[] args) throws InterruptedException {
        Solution1114 solution = new Solution1114();

        solution.first(() -> System.out.println("first"));
        solution.second(() -> System.out.println("second"));
        solution.third(() -> System.out.println("third"));
    }
}
