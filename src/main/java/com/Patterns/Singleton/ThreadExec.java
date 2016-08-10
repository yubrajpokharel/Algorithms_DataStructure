package com.Patterns.Singleton;

/**
 * Created by yubraj on 7/12/16.
 */
public class ThreadExec {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();

        new Thread(myThread).start();
        new Thread(myThread2).start();

    }
}
