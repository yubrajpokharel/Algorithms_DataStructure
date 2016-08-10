package com.Logical.TwoThreadsEvenOdd;

/**
 * Created by yubraj on 7/12/16.
 */
public class TwoThredsEvenOdd {
    public static void main(String[] args) {
        int max = 10;
        NumberPrinter numberPrinter = new NumberPrinter();

        new Thread(new Thread1(numberPrinter, max)).start();
        new Thread(new Thread2(numberPrinter, max)).start();
    }

}

