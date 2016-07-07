package com.Logical;

/**
 * Created by yubraj on 7/7/16.
 */
public class ContiniuousSumCheck {

    public static void main(String[] args) {
        final int[] array1 = { 23, 5, 4, 7, 2, 11 };
        final int[] array2 = {1, 3, 5, 23, 2};
        System.out.println("First : " + sumCheck(array1, 20));
        System.out.println("Second : " + sumCheck(array2, 8));

    }

    private static boolean sumCheck(int[] sequence, int total) {
        int sum = 0;
        for (int index = 0; index < sequence.length; index++) {
            if(sequence[index] > total ){
                sum = 0;
                continue;
            }

            sum += sequence[index];
            System.out.println(" sum += sequence[index] for " + sequence[index] + " : " + sum);

            for (int nextIndex = index + 1; nextIndex < sequence.length; nextIndex++) {
                sum+=sequence[nextIndex];
                System.out.println(" \tnext sum += sequence[index] => " + sequence[nextIndex] + " : " + sum);
                if(sum > total){
                    sum = 0;
                    break;
                }
                if(sum == total){
                    return true;
                }
            }

            if(sum > total){
                sum = 0;
                continue;
            }
            if(sum == total) return true;
        }
        return false;
    }

}