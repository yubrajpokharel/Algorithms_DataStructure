package com.Logical.TwoThreadsEvenOdd;

/**
 * Created by yubraj on 7/12/16.
 */
public class Thread2 implements Runnable {

    int max;
    NumberPrinter numberPrinter;

    public Thread2(NumberPrinter numberPrinter, int max){
        this.max = max;
        this.numberPrinter = numberPrinter;
    }

    @Override
    public void run() {
        NumberPrinter data = new NumberPrinter();
        for (int i = 1; i < max; i = i + 2) {
            try {
                numberPrinter.printOdd(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
