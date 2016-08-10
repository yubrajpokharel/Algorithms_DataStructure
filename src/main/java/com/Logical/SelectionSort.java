package com.Logical;

import java.util.Arrays;

/**
 * Created by yubraj on 7/9/16.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int num[] = {1,4,2,66,77,44,22,9,99};
        System.out.println(Arrays.toString(num));
        System.out.println("--------------------------------------");
        sort(num);
        System.out.println("--------------------------------------");
        System.out.println(Arrays.toString(num));
    }

    private static void sort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = i+1; j < num.length; j++) {
                System.out.println(Arrays.toString(num));
                if(num[i] > num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
}
