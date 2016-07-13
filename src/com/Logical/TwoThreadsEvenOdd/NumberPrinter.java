package com.Logical.TwoThreadsEvenOdd;

/**
 * Created by yubraj on 7/12/16.
 */
public class NumberPrinter {

    // To check if even number is printed or not.
    private boolean isEvenPrinted = true;

    public void printOdd(int number) throws InterruptedException {
        // Get a lock on NumberPrinter
        synchronized (this) {

            // Wait until even is not printed.
            if (!isEvenPrinted)
                wait();

            System.out.println(number);

            isEvenPrinted = false;

            // Notify the other waiting thread which is waiting on
            // NumberPrinter
            // Other thread will get out of waiting state
            notify();
        }
    }

    public void printEven(int number) throws InterruptedException {
        synchronized (this) {
            if (isEvenPrinted)
                wait();

            System.out.println(number);
            isEvenPrinted = true;
            notify();
        }
    }
}
