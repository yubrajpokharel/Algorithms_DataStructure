package com.Logical;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yubraj on 7/9/16.
 */
public class FindMax {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integerList.add(2*i);
            integerList.add(4);
            integerList.add(2);
        }
        System.out.println(integerList.toString());
        int max = findMax(integerList);
        System.out.println(max);

    }

    private static int findMax(List<Integer> integerList) {
        int maxTmp = integerList.get(0);
        for (int i = 1; i < integerList.size(); i++) {
            if(integerList.get(i) > maxTmp)
                maxTmp = integerList.get(i);
        }
        return maxTmp;
    }
}
