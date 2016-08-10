package com.Logical;

/**
 * Created by yubraj on 7/9/16.
 */
public class PairSum {
    public static void main(String[] args) {
        int num[] = {1,3,5,7,8,10,15};
        int val = 15;
        printPairSum(num, val);
    }

    private static void printPairSum(int[] num, int val) {
        // time complexity = O(n)
        int MAX = 1000;
        boolean bool[] = new boolean[MAX];
        for (int i = 0; i < num.length; i++) {
            int temp = val-num[i];
            if(temp>=0 && bool[temp]){
                System.out.println("Pair having sum : " + val +" is ["+num[i] + ", "+temp+"]");
            }
            bool[num[i]] = true;
            System.out.println("bool["+num[i]+"] : "+bool[num[i]] + "  bool["+temp+"]"+" "+bool[temp]);
        }
    }
}
