package com.Logical;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by yubraj on 7/10/16.
 * find sub-array in a array which has sum divisible by x and give max value among another
 * sub-arrays when divided by x.
 */
public class Max_Value {
    public static int num[] = {4, 5, 0, -2, -3, 1};
    public static int checker = 5;

    public static void main(String[] args) {
        System.out.println("Total Subarrays: "+findMax(num, checker));
    }

    private static int findMax(int[] num, int checker) {

        int sum = 0;
        int counter = 0;

        for (int i = 0; i < num.length; i++) {
            ArrayList<Integer> integers = new ArrayList<>();
            sum+=num[i];

            if(sum == checker || sum == 0){
                counter++;
            }


            for (int j = i + 1; j < num.length; j++) {
                sum += num[j];
                if(sum*-1 % checker == 0){
                    counter++;
                }

                if(sum % checker == 0){
                    counter++;
                }

            }

        }
        return counter;
    }

}

