package cn.davidliu.leetcode.algorithms.printFoobarAlternately;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.LinkedBlockingQueue;

public class FooBarTest {

    @Test
    public void testCase1() throws InterruptedException {
        // print 10 times
        FooBar fooBar = new FooBar(10);
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        Thread thread1 = new Thread(() -> {
            try {
                fooBar.foo(() -> {
                    try {
                        queue.put("foo");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                fooBar.bar(() -> {
                    try {
                        queue.put("bar");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();


        String expect = "foobarfoobarfoobarfoobarfoobarfoobarfoobarfoobarfoobarfoobar";
        String actual = String.join("", queue);
        Assert.assertEquals(expect, actual);
    }
}