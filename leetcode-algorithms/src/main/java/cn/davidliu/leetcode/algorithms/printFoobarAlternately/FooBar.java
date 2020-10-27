package cn.davidliu.leetcode.algorithms.printFoobarAlternately;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * https://leetcode.com/problems/print-foobar-alternately
 *
 * @author David Liu
 */
public class FooBar {

    private final ReentrantLock lock = new ReentrantLock();

    private final Condition condition = lock.newCondition();

    private final int n;

    private volatile boolean flag = true;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        lock.lock();
        for (int i = 0; i < n; i++) {
            // printFoo.run() outputs "foo". Do not change or remove this line.
            while (!flag) {
                condition.await();
            }
            printFoo.run();
            flag = false;
            condition.signal();
        }
        lock.unlock();
    }

    public void bar(Runnable printBar) throws InterruptedException {
        lock.lock();
        for (int i = 0; i < n; i++) {
            // printBar.run() outputs "bar". Do not change or remove this line.
            while (flag) {
                condition.await();
            }
            printBar.run();
            flag = true;
            condition.signal();
        }
        lock.unlock();
    }
}
