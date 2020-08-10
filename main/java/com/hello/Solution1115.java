package com.hello;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 交替打印FooBar
 * @author Administrator
 */
public class Solution1115 {
    private AtomicInteger integer = new AtomicInteger(0);
    private int n;

    public Solution1115(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while(integer.get() % 2 != 0) {
                Thread.sleep(1);
            }
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            integer.addAndGet(1);
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while(integer.get() % 2 == 0) {
                Thread.sleep(1);
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            integer.addAndGet(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Solution1115 solution1115 = new Solution1115(50);
        solution1115.foo(() -> System.out.println("foo"));
        solution1115.bar(() -> System.out.println("bar"));
    }
}
